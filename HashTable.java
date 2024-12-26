import java.util.*;
public class Hasht
{
	public static void main(String[] args)
	{
		Hashtable<String,Integer>ht=new Hashtable<String,Integer>();
		ht.put("a",100);
		ht.put("b",200);
		ht.put("c",300);
		ht.put("d",400);
		ht.put("e",500);
		System.out.println(ht);
		boolean val=ht.contains(400);
		System.out.println("400 is present"+val);
		val=ht.containsKey("d");
		System.out.println("d is present"+val);
	}
}
