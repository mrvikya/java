import java.util.*;
public class Linkedhashset
{
	public static void main(String [] args)
	{
		LinkedHashSet<String> set =new LinkedHashSet<String>();
		set.add("java");
		set.add("html");
		set.add("css");
		set.add("php");
		Iterator<String>itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
