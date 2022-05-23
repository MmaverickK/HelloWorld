package multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
	
	int limit = 10;
	Queue<Integer> queue = new LinkedList<Integer>();
	
	public static void main(String[] args) {
		
		ProducerConsumer pc = new ProducerConsumer();
		
		Thread producer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread consumer = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		producer.start();
		consumer.start();
		
		
//		try {
//			producer.join();
//			consumer.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
	}

	protected void consume() throws InterruptedException {
		int counter = 1;
		while(counter <= limit) {
		 synchronized (this) {
			
				while(queue.size() == 0) {
						wait();
				}
				Integer poll = queue.poll();
				System.out.println("Consumed:: "+poll);
				counter++;
				notify();
				Thread.sleep(1000);
			}
			
		}
		
	}

	protected void produce() throws InterruptedException {
		int counter = 1;
		while(counter <= limit) {
		synchronized (this){
			
				while(queue.size() == limit){
						wait();
				}
				queue.offer(counter);
				System.out.println("Produced:: "+counter);
				counter++;
				notify();
				Thread.sleep(1000);
			}
			
		}
		
	}

}
