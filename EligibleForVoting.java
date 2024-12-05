import java.util.Scanner;
class AgeException extends Exception
{
	AgeException(String msg)
	{
		super(msg);
	}
}
class EligibleForVoting
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the age:>>");
			int age=sc.nextInt();
			if(age<18)
			{
				throw new AgeException("Your are not eligible for voting :");
			}
			else
			{
				System.out.println("Congrats ! you are Eligible for Voting");
			}
		}
		catch(AgeException ae)
		{
			System.out.println(ae.getMessage());
		}
	}
}
			
		