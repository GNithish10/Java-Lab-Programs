//Implementing the Runnable interface
class MyRunnable implements Runnable{
	@Override
	public void run() {
		try {
			//Print the name of the thread executing
			System.out.println(Thread.currentThread().getName()+" is running.");
			//Sleep for 500 milliseconds to simulate work
			Thread.sleep(500);
			System.out.println(Thread.currentThread().getName()+" has finished execution.");
		}catch(InterruptedException e) {
			System.out.println(Thread.currentThread().getName()+" was interrupted.");
		}
		
	}
	
}

public class MultiThread_L7 {

	public static void main(String[] args) {
		// Create instances of MyRunnable
		MyRunnable runnable = new MyRunnable();
		
		//Create Threads using the Runnable instance
		Thread thread1 = new Thread(runnable, "Thread-1");
		Thread thread2 = new Thread(runnable, "Thread-2");
		Thread thread3 = new Thread(runnable, "Thread-3");
		
		//Start each Thread
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
		System.out.println(thread3.isAlive());
		
		//Optionally, wait for all threads to finish before main exits
		try{
			thread1.join();
			thread2.join();
			thread3.join();
			
		}catch (InterruptedException e) {
			System.out.println("Main thread was interrupted.");
		}
		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
		System.out.println(thread3.isAlive());
		System.out.println("All thread have finished execution");

	}

}
