import java.util.Scanner;
class SumOf2Arrays
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of n1: ");
		int n1=sc.nextInt();
		System.out.println("Enter the size of n2 : ");
		int n2=sc.nextInt();
		System.out.println("Enter the size of n3 : ");
		int n3=sc.nextInt();
		if(n1!=n2)
		{
			System.out.println("The two array sizes are not equal ....");
			return;
		}
		int a1[]=new int[n1];
		System.out.println("Enter the array a1 elements : ");
		for(int i=0;i<n1;i++)
		{
			a1[i]=sc.nextInt();
		}
		int a2[]=new int[n2];
		System.out.println("Enter  the array a2 Elements : ");
		for(int i=0;i<n2;i++)
		{
			a2[i]=sc.nextInt();
		}
		int a3[]=new int[n3];
		System.out.println("The sum of 2 array Elements are : \n");
		for(int i=0;i<n3;i++)
		{
			a3[i]=a1[i]+a2[i];
			System.out.println(a3[i]);
		}
	}
}
		
		