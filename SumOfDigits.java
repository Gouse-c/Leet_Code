import java.util.Scanner;
class SumOfDigits
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number : ");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0) 
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("\nThe Sum of the Digits of a number is : "+sum);
	}
}
			