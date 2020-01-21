import java.util.*;
public class arraysum
{
	public static void main(String args[])
	{
		int arr[];
		int sum=0;
		arr =new int [10];
		System.out.println("enter the number of elements");
		Scanner myobj=new Scanner (System.in);
		int a=myobj.nextInt();
		System.out.println("enter the "+a+" elements");
		Scanner input=new Scanner (System.in);
		for(int i=0;i<a;i++)
		{
			int n=input.nextInt();
			arr[i]=n;
			sum=sum+arr[i];
		}
		System.out.println("Sum of array is:"+sum);
	}
}
