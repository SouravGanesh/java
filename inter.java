import java.util.Scanner;
public class number {
	public static void main(String args [])
	{
		Scanner myobj=new Scanner (System.in);
		System.out.println("Enter 1st Number in Decimal");
		int a=myobj.nextInt();
		System.out.println("Enter 2nd Number in Decimal");
		int b=myobj.nextInt();
	    hexa h=new hexa();
	    bin i=new bin();
	    dec d=new dec();
	    d.add(a, b);
	    h.add(a, b);
	    i.add(a, b);
	    
		
	}

}

interface In 
{
	void add(int a,int b);
}

class hexa extends number implements In
{
	int sum;
	 public void add(int a,int b)
	 {
		 sum=a+b;
		 String ans=Integer.toHexString(sum);
		 System.out.println("Addition of 2 HEX number = "+ ans);
	 }
	

}

class bin extends number implements In
{
	int sum;
	 public void add(int a,int b)
	 {
		 sum=a+b;
		 String ans=Integer.toBinaryString(sum);
		 System.out.println("Addition of 2 Binary number = "+ ans);
	 }
	

}

class dec extends number implements In
{
	int sum;
	 public void add(int a,int b)
	 {
		 sum=a+b;
		 System.out.println("Addition of 2 Decimal number = "+sum);
	 }
	

}
