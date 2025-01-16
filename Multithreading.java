class Multithreading extends Thread
{
	public void run()
	{
		System.out.println("My thread is running state");
	}
	public static void main(String []args)
	{
		Multithreading obj=new Multithreading();
		obj.start();
	}
}		
