import java.util.Scanner;
class ReverseOfAnArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int n=sc.nextInt();
		System.out.println("Enter the array elements:");
		int a[]=new int[n];
		for(int i=0;i<=a.length-1;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Before Reversing array elements are:");
		for(int i=0;i<=a.length-1;i++){
			System.out.println(a[i]);
		}
		System.out.println("After Reversing array elements are:");
		for(int i=a.length-1;i>=0;i--){
			System.out.println(a[i]);
		}
	}
}