package multithreading;


public class Pyramid {
	
	int counter = 1;
	boolean isEven = false;
	
	public static void main(String[] args) {
		
		
		
		Pyramid p = new Pyramid();
		
		Thread even = new Thread(new Runnable() {

			@Override
			public void run() {
				p.printEven();
			}

		});
		
		Thread odd = new Thread(new Runnable() {
			
			@Override
			public void run() {
				p.printOdd();
			}

			
		});
		
		odd.start();
		even.start();
		
		try {
			odd.join();
			even.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("End");
		
		
	}
	
	private void printEven() {
		synchronized (this) {
			while(counter < 10) {
				while(counter % 2 != 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				for(int i=0; i<counter;i++)
				System.out.print("* ");
				System.out.println("E");
				
				counter++;
				notify();
			}
		}
		
	}
	
	private void printOdd() {
		synchronized (this) {
			while(counter < 10) {
				while(counter % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				for(int i=0; i<counter;i++)
					System.out.print("* ");
				System.out.println("O");
				counter++;
				notify();
			}
			
		}
		
		
	}

}

