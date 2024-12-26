import java.util.*;
public class Treeset
{
	public static void main(String[] args)
	{
		TreeSet ts=new TreeSet();
		ts.add("Red");
		ts.add("one");
		ts.add("Null");
		ts.add("Orange");
		ts.add("Red");
		System.out.println("members from treeset="+ts);
		Set ts2=new TreeSet();
		ts2.add(1);
		ts2.add(2);
		ts2.add(3);
		ts2.add(4);
		ts2.add(5);
		System.out.println("members from treeset="+ts2);
	}
}
