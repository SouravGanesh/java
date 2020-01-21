import java.util.*;

public class facto 
{

	public static void main(String args[])
	{
		int f=1;
		System.out.println("enter the input");
		Scanner myobj=new Scanner(System.in);
		int n=myobj.nextInt();
		 if (n < 0)
		      System.out.println("Number should be non-negative.");
		    else
		    {
		      for (int c = 1; c <= n; c++)
		    	  		f = f*c;

		      System.out.println("Factorial of "+n+" is = "+f);
		    }
	}
}
