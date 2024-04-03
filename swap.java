public class swap
{
public static void main (String [] args)
{
int a = 90;
int b = 190;
b = (a+b)-(a=b);
a = (a+b)-(b=a);
System.out.println("a= "+b);
System.out.println("b= "+a);
}
}