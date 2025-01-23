class Nsynchro
{
	synchronized void disp()
	{
		try
		{
			System.out.println("come on");
			System.out.println("student");
			System.out.println("enjoy");
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("book");
		System.out.println("reading");
	}
}
	class test implements Runnable
	{	
		Thread d;
		Nsynchro ob1;
		public test(Nsynchro o1)
		{
			ob1=o1;
			d=new Thread(this);
			d.start();
		}
		public void run()
		{
			ob1.disp();
		}
	}
	class Slip30_1
	{
		public static void main(String [] args)
		{
			Nsynchro ob2=new Nsynchro();
			test ob3=new test(ob2);
			test ob4=new test(ob2);
		}
	}
