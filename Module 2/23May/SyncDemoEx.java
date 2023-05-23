package task_23_may;

class Sender
{
	public void send(String msg) 
	{
		System.out.println("Sending" + msg);
		
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		System.out.println( msg+ "Sent");
	}
}
class Threadsend extends Thread
{
	
	Sender sender;
	String msg;
	
	public Threadsend(Sender sender, String msg) {
		// TODO Auto-generated constructor stub
		this.sender = sender;
		this.msg = msg;
			
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		synchronized (msg)
		{
			sender.send(msg);
		}
	}
}
public class SyncDemoEx 
{
	public static void main(String[] args) 
	{
		Sender sender = new Sender();
		
		Threadsend t1 =new Threadsend (sender,"Hii");
		Threadsend t2 =new Threadsend (sender,"Byee");
		t1.start();
		t2.start();
		
		
	}
}
