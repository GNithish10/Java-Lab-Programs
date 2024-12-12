class MyThread extends Thread {
    private String threadName;

    // Constructor
    public MyThread(String name) {
        // Call the base class (Thread) constructor
        super(name);
        this.threadName = name;
    }

    // The run method that will be executed when the thread starts
    @Override
    public void run() {
        System.out.println("Starting thread: " + threadName);
        try {
            // Simulate some work with sleep
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Ending thread: " + threadName);
    }

    public static void main(String[] args) {
        // Create instances of MyThread
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");

        // Start the threads
        thread1.start();
        thread2.start();

        // Main thread execution
        System.out.println("Main thread is running concurrently.");

        // Wait for both threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Both threads have completed execution.");
    }
}