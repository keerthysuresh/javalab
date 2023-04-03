import java.util.Scanner;
class complex
{
   public static void main(String args[])
   {
       Scanner s=new Scanner(System.in);
       int a, b, c, d;
       System.out.println("enter the first complex number");
         a=s.nextInt();
         b=s.nextInt();
       System.out.println(" the number is:"+a+"+"+b+"i");
       System.out.println("enter the second complex number");
         c=s.nextInt();
         d=s.nextInt();
       System.out.println(" the number is:"+c+"+"+d+"i");
       System.out.println(" the sum is:"+(a+c)+"+"+(b+d)+"i");
    }
}

