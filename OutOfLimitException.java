class OutOfLimitException extends Exception
{
	OutOfLimitException(String msg)
	{
		super(msg);
	}
}
class TableCheck
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("\nEnter the table number : ");
			int t=sc.nextInt();
			System.out.println("Enter the start point : ");
			int a=sc.nextInt();
			System.out.println("Enter the end point : ");
			int n=sc.nextInt();
			System.out.println("\nThe Table are : ");
			for(int i=a;i<=n;i++)
			{
				throws new OutOfLimitException("You have entered a wrong number..");
				System.out.println(t +" x "+ i +" = "+ t*i );
			}
		}
		catch(OutOfLimitException oe)
		{
			System.out.println(oe.message);
		}
	}
}