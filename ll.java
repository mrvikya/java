import java.util.*;
public class ll
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many friends name you want to enter");
		int n=sc.nextInt();
		LinkedList ll=new LinkedList();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter friend name");
			ll.add(sc.next());
		}
		System.out.println("Friends name:"+ll);
	}
}
