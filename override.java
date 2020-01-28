#run time
#signatures will be preserved

import java.util.*;
 class A
{
    int h=10;
    public void printnum()
    {
        System.out.println(" h = "+h);
    }
}
class B extends A
{
    int h=5;
    public void printnum()
    {
        System.out.println(" h = "+h);
    }
  
}
public class override
{
    public static void main(String args[])
    {
        A obj1=new A();
        B obj2=new B();
        obj1.printnum();
        obj2.printnum();
    }
}
