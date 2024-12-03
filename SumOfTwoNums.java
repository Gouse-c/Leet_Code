import java.util.Scanner;
class SumOfTwoNums{
    public int getSum(int a, int b) {
        int ans = 0;
        int carry = 0;
        while (b != 0) {
            ans = a ^ b;
            carry = a & b;
            carry = carry << 1;
            a = ans;
            b = carry;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = sc.nextInt();
        SumOfTwoNums nums = new SumOfTwoNums();
        int sum = nums.getSum(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}
