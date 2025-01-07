import java.util.Scanner;
class CopyOfElementsFromOneArrayToAnotherArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array elements:");
		int n=sc.nextInt();
		System.out.println("Enter the array elements:");
		int a1[]=new int[n];
		int a2[]=new int[n];
		for(int i=0;i<=a1.length-1;i++){
			a1[i]=sc.nextInt();
		}
		System.out.println("The elements of array 1 is : ");
		for(int i=0;i<=a1.length-1;i++){
			System.out.println(a1[i]);
		}
		for(int i=0;i<=a1.length-1;i++){
			a2[i]=a1[i];
		}
		System.out.println("The elements of array 2 is : ");
		for(int i=0;i<=a2.length-1;i++){
			System.out.println(a2[i]);
		}
	}
}	