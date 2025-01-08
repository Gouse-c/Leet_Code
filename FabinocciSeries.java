import java.util.Scanner;
class FabinocciSeries
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number : ");
		int n=sc.nextInt();
		int a=1,b=1;
		int c=a+b;
		int count =3;
		if(n==1)
		{
			System.out.println("1");
		}
		else if(n==2)
		{
			System.out.println("2");
		}
		else
		{
			while(count<n)
			{
				a=b;
				b=c;
				c=a+b;
				count++;
			}
			System.out.println("The nth series of the fabinocci number is :" +c);
		}
	}
}