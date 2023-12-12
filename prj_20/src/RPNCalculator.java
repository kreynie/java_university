import java.util.Scanner;
import java.util.Stack;

public class RPNCalculator {
    public static double calculateRPN(String expression) {
        String[] tokens = expression.split("\\s+");
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation(token, operand1, operand2);
                stack.push(result);
            }
        }

        return stack.pop();
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private static boolean isOperator(String str) {
        return str.matches("[+\\-*/]");
    }

    private static double performOperation(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    throw new ArithmeticException("Деление на ноль");
                }
            default:
                throw new IllegalArgumentException("Неправильный оператор: " + operator);
        }
    }

    public static void main(String[] args) {
        // Пример использования калькулятора с обратной польской нотацией
        String rpnExpression = "2 3 +";
        double result = calculateRPN(rpnExpression);
        System.out.println("Результат: " + result);

        rpnExpression = "2 3 * 4 5 * +";
        result = calculateRPN(rpnExpression);
        System.out.println("Результат: " + result);

        rpnExpression = "2 3 4 5 6 * + - / 2 /";
        result = calculateRPN(rpnExpression);
        System.out.println("Результат: " + result);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите RPN выражение: ");
        rpnExpression = scanner.nextLine();
        result = calculateRPN(rpnExpression);
        System.out.println("Результат: " + result);
        scanner.close();
    }
}
