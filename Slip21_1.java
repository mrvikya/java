import java.util.*;
import java.io.*;
class Slip19_1
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter hoe many subjects you want to enter");
		int n=s.nextInt();
		LinkedList l=new LinkedList();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a subject name");
			l.add(s.next());
		}
		System.out.println("subject list:"+l);
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
