import java.util.*;
import java.io.*;
class Slip19_1
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter hoe many numbers you want to enter");
		int n=s.nextInt();
		LinkedList l=new LinkedList();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a number");
			l.add(s.nextInt());
		}
		System.out.println("Linked list element are:"+l);
		System.out.println("Negative numbers:");
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			int no=((Integer)it.next()).intValue();
			if(no<0)
			{
				System.out.println(no);
			}
		}
	}
}
