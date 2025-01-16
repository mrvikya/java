class Slip15_1
{
	public static void main(String []args)
	{
		String t_name;
		int t_priority;
		Thread t=Thread.currentThread();
		t_name=t.getName();
		System.out.println("Current thread name "+t_name);
		t_priority=t.getPriority();
		System.out.println("current thread priority"+t_priority);
		t.setName("this is my thread");
		t_name=t.getName();
		System.out.println("New name is"+t_name);
	}
}
