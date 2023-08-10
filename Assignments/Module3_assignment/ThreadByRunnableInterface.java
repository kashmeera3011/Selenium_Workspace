
public class ThreadByRunnableInterface implements Runnable
{
	
	    @Override
	    public void run() 
	    {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Thread is running: " + i);
	            try 
	            {
	                Thread.sleep(1000); // Sleep for 1 second
	            } 
	            catch (InterruptedException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	    }

	    public static void main(String[] args) 
	    {
	        ThreadByRunnableInterface myRunnable = new ThreadByRunnableInterface();
	        Thread thread = new Thread(myRunnable);

	        thread.start(); // Start the thread
	    }
}

