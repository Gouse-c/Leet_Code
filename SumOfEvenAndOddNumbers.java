import java.util.Scanner;
class SumOfEvenAndOddNumbers
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,j;
		System.out.print("\nEnter n :");
		int n = sc.nextInt();
		int even_sum =0;
		int odd_sum =0;
		System.out.print("\nEven Numbers -> ");
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
				even_sum+=i;
			}
		}
		System.out.print("\nOdd Numbers -> ");
		for(j=1;j<=n;j++)
		{
			if(j%2!=0)
			{
				System.out.print(j+" ");
				odd_sum+=j;
			}
		}
		System.out.println("\nEven Numbers Sum -> "+even_sum);
		System.out.println("\nOdd Numbers Sum -> "+odd_sum);
	}
}