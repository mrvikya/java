import java.util.*;
public class Arraylist
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many cities you want to enter");
		int n=sc.nextInt();
		ArrayList Al=new ArrayList();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter city name");
			Al.add(sc.next());
		}
		System.out.println("cities:"+Al);
		System.out.println("Before remove size"+Al.size());
		Al.clear();
		System.out.println("size"+Al.size());
	}
}
