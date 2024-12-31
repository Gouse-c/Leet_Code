import java.util.Scanner;
class NaturalNumbersExceptSomeMultiples
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%7!=0 && i%8!=0 && i%9!=0)
			{
				System.out.println(i+" ");
			}
		}
	}
}