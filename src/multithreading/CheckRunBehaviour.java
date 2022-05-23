package multithreading;

public class CheckRunBehaviour {
	
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for(int i=1; i<=5; i++) {
					String s = i+" :: "+Thread.currentThread().getName();
					System.out.println(s);
				}
				
			}
		};
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.run();
		t2.run();
		
		
		
	}

}
