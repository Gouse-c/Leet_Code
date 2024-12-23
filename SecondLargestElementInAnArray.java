import java.util.Scanner;
class SecondLargestElementInAnArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
			System.outs.println("Enter the size of an array : ");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the array Elements : ");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int fmax=a[0];
			int smax=a[0];
			for(int i=0;i<n;i++)
			{
				if(fmax<a[i])
				{
					smax=fmax;
					fmax=a[i];
				}
				else if(smax<a[i])
				{
					smax=a[i];
				}
			}
			System.out.println("The Second Largest Element in the array is : ");
			System.out.println(smax);
	}
}

			