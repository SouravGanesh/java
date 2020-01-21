import java.util.*;

public class temperature
{
	public static void main(String args[])
	{
		System.out.println("enter the temperature in F");
		Scanner myobj=new Scanner(System.in);
		int n=myobj.nextInt();
		int c;
		c=(5*(n-32))/9;
		System.out.println("Temperature in celcius ="+c);
		
	}
}
