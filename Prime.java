import java.util.*;
public class prime 
{
	public static void main(String args[])
	{
		System.out.println("enter the number");
		Scanner myobj=new Scanner (System.in);
		int n=myobj.nextInt();
		for(int i=2;i<=n;i++)
		{
			int count=0;
			for(int j=1;j<=n;j++)
			{
				if(i%j==0)
				{
					count=count+1;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}

}
