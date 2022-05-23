package multithreading;

public class OddEven {
	
	int counter = 1;
	
	public static void main(String[] args) {
		
		
		
		OddEven oe = new OddEven();
		
		Thread even = new Thread(new Runnable() {

			@Override
			public void run() {
				oe.printEven();
			}

		});
		
		Thread odd = new Thread(new Runnable() {
			
			@Override
			public void run() {
				oe.printOdd();
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
				System.out.println("E ::"+counter);
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
				System.out.println("O ::"+counter);
				counter++;
				notify();
			}
			
		}
		
		
	}

}
