import java.util.Random;
public class Slip13_2 implements Runnable
{
	private String t_name;
	private int sleep_Time;
	public Slip13_2(String name)
	{
		t_name=name;
		Random rand=new Random();
		sleep_Time=rand.nextInt(5000);
	}
	public void run()
	{
		System.out.println(t_name+"created.\n");
		try
		{
			Thread.sleep(sleep_Time);
			System.out.println(t_name+"sleeps for "+sleep_Time+" milliseconds.\n");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(t_name+"dead");
	}
	public static void main(String [] args)
	{
		Thread t1=new Thread(new Slip13_2("Thread 1..."));
		Thread t2=new Thread(new Slip13_2("Thread 2..."));
		t1.start();
		t2.start();
		try
		{
			t1.join();
			t2.join();
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
		}
		System.out.println("Main thread Finish successfully");
	}
}
