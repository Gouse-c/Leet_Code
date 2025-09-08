import java.util.*;

class NoZeroIntegerSplitter {
    private boolean containsZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) return true;
            num /= 10;
        }
        return false;
    }

    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            int j = n - i;
            if (!containsZero(i) && !containsZero(j)) {
                return new int[]{i, j};
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution sol = new Solution();
        int[] result = sol.getNoZeroIntegers(n);
        if (result.length == 2) System.out.println(result[0] + " " + result[1]);
        else System.out.println("-1");
    }
}
