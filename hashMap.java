import java.util.*;
public class hashMap
{
	public static void main(String [] args)
	{
		HashMap<Object,String> hm=new HashMap<Object,String>();
		hm.put(new Integer(9),"Nine");
		hm.put(new Integer(4),"Four");
		hm.put(new Integer(2),"Two");
		hm.put(new Integer(1),"One");
		hm.put(new Integer(3),"Three");
		display(hm);
		TreeMap tm=new TreeMap(hm);
		display(tm);
	}
public static void display(Map hmm)
{
	Set s=hmm.entrySet();
	Iterator it=s.iterator();
	System.out.println("key \t value");
	while(it.hasNext())
	{
		Map.Entry m=(Map.Entry)it.next();
		int key=(Integer)m.getKey();
		String value=(String)m.getValue();
		System.out.println(key+"\t"+value);
	}
}
}
