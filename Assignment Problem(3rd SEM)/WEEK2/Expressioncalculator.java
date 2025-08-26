import java.util.*;

public class Expressioncalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a math expression (e.g., 5 + 3 * 2 - 4 / 2): ");
        String expr = sc.nextLine().replaceAll(" ", "");
        try {
            double result = evaluateExpression(expr);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Invalid expression.");
        }
        sc.close();
    }

    public static double evaluateExpression(String expr) throws Exception {
        List<Double> numbers = new ArrayList<>();
        List<Character> operators = new ArrayList<>();
        StringBuilder numberBuffer = new StringBuilder();

        // Parse expression into numbers and operators
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (Character.isDigit(ch) || ch == '.') {
                numberBuffer.append(ch);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                if (numberBuffer.length() == 0) throw new Exception("Invalid format");
                numbers.add(Double.parseDouble(numberBuffer.toString()));
                numberBuffer.setLength(0);
                operators.add(ch);
            } else {
                throw new Exception("Invalid character in expression");
            }
        }

        if (numberBuffer.length() > 0) {
            numbers.add(Double.parseDouble(numberBuffer.toString()));
        }

        // Handle * and / first (operator precedence)
        for (int i = 0; i < operators.size(); ) {
            char op = operators.get(i);
            if (op == '*' || op == '/') {
                double a = numbers.get(i);
                double b = numbers.get(i + 1);
                double result = (op == '*') ? (a * b) : (a / b);
                numbers.set(i, result);
                numbers.remove(i + 1);
                operators.remove(i);
            } else {
                i++;
            }
        }

        // Handle + and -
        double finalResult = numbers.get(0);
        for (int i = 0; i < operators.size(); i++) {
            char op = operators.get(i);
            double b = numbers.get(i + 1);
            finalResult = (op == '+') ? (finalResult + b) : (finalResult - b);
        }

        return finalResult;
    }
}
