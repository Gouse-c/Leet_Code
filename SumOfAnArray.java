import java.util.Scanner;
class SumOfAnArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the size of an array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("\nEnter the array elements : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of the array elements was :" +sum);
	}
}
		