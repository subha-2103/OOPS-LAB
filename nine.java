import java.util.*; 
class nine
 {
  static public void main(String[] args)throws Exception
  {
   Scanner s1 = new Scanner(System.in);
   String s11;
   int a,b;
   System.out.println("Enter a value");
   s11 = s1.nextLine();
   a = Integer.parseInt(s11);
      a++;
   b = a;
   System.out.println("Value of b is "+b);
   ++b;
   a = a++;
   a = b;
    System.out.println("value of b is"+b);
  }}
  