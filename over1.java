#compilation time 
#signatures are going to change

import java.util.*;
 class a
{
    public void print(int a,char b)
    {
        System.out.println(a+"and"+b);
    }

    public void print(char a,int b)
    {
        System.out.println(a+"and"+b);
    }
}
public class over1
{
    public static void main(String args[])
    {
        a obj=new a();
        obj.print(1,'a');
        obj.print('A', 2);
    }
}



import java.util.*;
 class a
{
    public void area(int l,int b)
    {
        System.out.println("area of rectangle = "+l*b);
    }

    public void area(int b)
    {
        System.out.println("area of square = "+b*b);
    }
}
public class over1
{
    public static void main(String args[])
    {
        a obj=new a();
        obj.area(2,3);
        obj.area(2);
    }
}



import java.util.*;
 class init
{
    int h;
    init(int l)
    {
        h=l;
        System.out.println("using parametarised const , h = "+h);
    }

    init()
    {
        h=5;
        System.out.println("default const, h = "+h);
    }
  
}
public class cons
{
    public static void main(String args[])
    {
        init obj1=new init();
        init obj2=new init(10);

    }
}
