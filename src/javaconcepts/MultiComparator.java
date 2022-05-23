package javaconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MultiComparator {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Ram", 10000);
		Employee emp2 = new Employee(2, "Shyam", 5000);
		Employee emp3 = new Employee(3, "Rohan", 20000);
		Employee emp4 = new Employee(4, "Shyam", 50000);
		Employee emp5 = new Employee(5, "Rohan", 200);
		
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		System.out.println(empList);
		
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				int nameCompResult = o1.getName().compareTo(o2.getName());
				if(nameCompResult != 0) {
					return nameCompResult;
				}else {
					return Long.compare(o1.getSalary(), o2.getSalary());
					
				}
			}
			
		});
		
		System.out.println(empList);
		
		
	}
	

}


class Employee {
	
	private int id;
	
	private String name;
	
	private long salary;
	
	

	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (salary ^ (salary >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
}
