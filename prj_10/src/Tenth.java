import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Выберите задание:");
            System.out.println("1. Вычислить сумму цифр натурального числа.");
            System.out.println("2. Вывести нечетные числа из последовательности.");
            System.out.println("3. Вывести цифры натурального числа по одной.");
            System.out.println("0. Выйти");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите натуральное число:");
                    int N1 = scanner.nextInt();
                    int sum = sumOfDigits(N1);
                    System.out.println("Сумма цифр числа: " + sum);
                    break;

                case 2:
                    System.out.println("Введите последовательность натуральных чисел (0 для завершения):");
                    printOddNumbers();
                    break;

                case 3:
                    System.out.println("Введите натуральное число:");
                    int N3 = scanner.nextInt();
                    System.out.println("Цифры числа:");
                    printDigits(N3);
                    break;

                case 0:
                    System.out.println("Выход");
                    break;

                default:
                    System.out.println("Некорректный выбор. Попробуйте еще раз.");
            }
        } while (choice != 0);
    }

    public static int sumOfDigits(int N) {
        if (N < 10) {
            return N;  
        } else {
            int lastDigit = N % 10;  
            int remainingDigits = N / 10;  
            return lastDigit + sumOfDigits(remainingDigits);  
        }
    }

    public static void printOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println("Четное число");
            return;
        }

        if (num % 2 != 0) {
            System.out.println(num);
        }

        printOddNumbers();
    }

    public static void printDigits(int N) {
        if (N < 10) {
            System.out.println(N);  
        } else {
            int lastDigit = N % 10;  
            int remainingDigits = N / 10;  
            printDigits(remainingDigits);  
            System.out.println(lastDigit);  
        }
    }
}
