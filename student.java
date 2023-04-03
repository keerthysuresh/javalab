import java.util.Scanner;
public class student
{
	public static void main(String args[])
	{
		int n,total=0;
		float percentage;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of subjects:");
		n=s.nextInt();
		int marks[]=new int[n];
		float p=(float)100/(n*100);
		System.out.println("Enter marks :");
		for(int i=0;i<n;i++)
		{
			marks[i]=s.nextInt();
			total=total+marks[i];
		}
		percentage=(total / (float)n);
		System.out.println("Total mark obtained:"+total);
		System.out.println("Percentage:"+percentage + "%");
	}
}
