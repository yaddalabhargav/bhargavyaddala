package aug3;
/*Blocking queue problem implementing consumer -producer problems
also do check on blocking and non blocking Queue, based on your interest go ahead and also explore Dequeue interface if you wish to.*/
/*java.util.concurrent.BlockingQueue is a Queue that supports typically operations that wait for the queue to become non-empty when retrieving and removing an element and wait for space to become available in the queue while adding an element.
BlockingQueue doesn’t  allow to add null values and throw NullPointerException if you try to add null value in the queue.
BlockingQueue implementations are thread-safe. All queuing methods are basically atomic in nature and use internal locks or other forms of concurrency control.
BlockingQueue primarily used for implementing producer consumer problem.*/


import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueProblem{

	//Shared Queue
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
	
	public static void main(String[] args) throws InterruptedException {

		//Producer Thread
		Thread producerThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		//Consumer Thread
		Thread consumerThread= new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				try {
					consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		producerThread.start();
		consumerThread.start();
	}

	private static void producer() throws InterruptedException{
		Random random= new Random();
		while (true) {
			Thread.sleep(2000);
			int produced = random.nextInt(100);
			queue.put(produced);
			System.out.println("Produced:"+produced);
		}
	}
	
	private static void consumer() throws InterruptedException{
		while (true) {
				Thread.sleep(2000);
				Integer consumed = queue.take();
				System.out.println("Consumed:"+consumed);
			}
		}
}
