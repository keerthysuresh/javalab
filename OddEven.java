import java.util.Scanner;
public class OddEven
{public static void main(String args[])
{int a;
Scanner n=new Scanner(System.in);
System.out.println("enter the numbers");
a=n.nextInt();
if(a%2==0)
{System.out.println(a+ " is even");
}
else
{
System.out.println(a+ " is odd");
}
}
}

