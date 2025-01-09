import java.util.Scanner;
class ReverseOfANumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number : ");
		int num=sc.nextInt();
		String s1="";
		while(num!=0)
		{
			int rem=num%10;
			s1+=rem;
			num=num/10;
		}
		System.out.println(s1);
	}
}