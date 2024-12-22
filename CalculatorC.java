import java.util.Scanner;
import java.util.Stack;
class CalculatorC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a mathematical expression (e.g., 3+5*2-8/4): ");
        String expression = sc.nextLine();

        CalculatorC calculator = new CalculatorC();
        int result = calculator.calculate(expression);

        System.out.println("Result: " + result);

        sc.close();
    }

    public int calculate(String s) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> opr = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                int n = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    n = n * 10 + (s.charAt(i) - '0');
                    i++;
                }
                val.push(n);
                i--;
            } else if (ch == '+' || ch == '-') {
                while (!opr.isEmpty() && (opr.peek() == '+' || opr.peek() == '-' || opr.peek() == '*' || opr.peek() == '/')) {
                    compute(val, opr);
                }
                opr.push(ch);
            } else if (ch == '*' || ch == '/') {
                while (!opr.isEmpty() && (opr.peek() == '*' || opr.peek() == '/')) {
                    compute(val, opr);
                }
                opr.push(ch);
            }
        }

        while (!opr.isEmpty()) {
            compute(val, opr);
        }

        return val.peek();
    }

    private void compute(Stack<Integer> val, Stack<Character> opr) {
        if (val.size() < 2 || opr.isEmpty()) return;

        int v2 = val.pop();
        int v1 = val.pop();
        char op = opr.pop();

        if (op == '+') val.push(v1 + v2);
        else if (op == '-') val.push(v1 - v2);
        else if (op == '*') val.push(v1 * v2);
        else if (op == '/') val.push(v1 / v2);
    }
}
