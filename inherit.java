import java.util.*;
class book{
	String title,author;
	int page;
	book()
	{
		
	}
	book(String a,String b, int c)
	{
		title=a;
		author=b;
		page=c;
	}
	public void getdata()
	{
		System.out.println(title+","+author);
	}
}
class ebook extends book
{
	String size,formet;
	ebook()
	{
		
	}
	public ebook(String title,String author,int page)
	{
		super(title,author,page);
	}
	public void setsize(String a)
	{
		size=a;
		formet="pdf";
	}
}
class printed extends book
{
	int n,b,s;
	printed(String title,String author,int page,int base,int copy)
	{
		super(title,author,page);
		b=base;
		n=copy;
	}
	public void setsp()
	{
		s=5%b+b;
	}
	public void buy()
	{
		n=n-1;
	}
	public void print()
	{
		System.out.println("title:"+title+",author:"+author+",no. of pages:"+page+",copies avilable:"+n+",price:"+s);
	}
}
public class inher
{
	public static void main(String args[])
	{
		printed b1=new printed("The end","sourav",250,300,500);
		ebook b2=new ebook();
		b2.setsize("10mb");
		b1.setsp();
		System.out.println("Initial ");
		b1.print();
		while(true)
		{
			System.out.println("wanna buy?,press 1");
			Scanner myobj=new Scanner(System.in);
			int n=myobj.nextInt();
			if(n==1)
			{
				b1.buy();
				System.out.println("After buy");
				b1.print();
				
			}
			else
			{
				System.out.println("thank you!");
				System.exit(0);
			}
		}
	}
}
