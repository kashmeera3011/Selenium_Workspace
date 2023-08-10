

class MyThread extends Thread 
{
	    @Override
	    public void run() {
	        for (int i = 1; i <= 3; i++) {
	            System.out.println("Thread is running: " + i);
	            try {
	                Thread.sleep(1000); // Sleep for 1 second
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
}

public class ExtendingThreadClass 
{
	    public static void main(String[] args) 
	    {
	        MyThread myThread = new MyThread();
	        myThread.start(); // Start the thread
	    }
}

