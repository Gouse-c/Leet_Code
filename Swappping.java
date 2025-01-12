import java.util.Scanner;
class Swappping
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the value of a : ");
		int a=sc.nextInt();
		System.out.println("\nEnter the value of b : ");
		int b=sc.nextInt();
		System.out.println("Before Swapping the value of a :\n"+a);
		System.out.println("Before Swapping the value of b  :\n"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping the value of a :\n"+a);
		System.out.println("After Swapping the value of b  :\n"+b);
	}
}		