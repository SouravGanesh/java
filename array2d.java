import java.util.*;
public class array2d 
{
	public static void main(String args[])
	{
		int arr[][];
		arr=new int[10][10];
		System.out.println("enter number of rows:");
		Scanner myobj=new Scanner(System.in);
		int n=myobj.nextInt();
		System.out.println("enter number of column:");
		int m=myobj.nextInt();
		System.out.println("entewr the elements:");
		Scanner input=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				int a=input.nextInt();
				arr[i][j]=a;
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}
