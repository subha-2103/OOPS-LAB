import java.util.*;
class eight
{
static public void main(String[]args)throws Exception
{
Scanner s1 = new Scanner(System.in);
String s11;
int x,y;
System.out.println("enter value of x");
s11=s1.nextLine();
x=Integer.parseInt(s11);
System.out.println("enter value of y");
s11=s1.nextLine();
y=Integer.parseInt(s11);
x = x + y;
System.out.println("after addition,value of x is" + x);
x = x-=y;
System.out.println("after subtraction,value of x is"+x);
}}