import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        System.out.print("Целое число: ");
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Введено некорректное число");
            return;
        }
        int given_number = sc.nextInt();


        if (given_number < 1) {
            System.out.println("Число должно быть больше единицы");
            return;
        }
        System.out.println(factorial(given_number));
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i < n+1; i++) {
            result *= i;
        }
        return result;
    }
}