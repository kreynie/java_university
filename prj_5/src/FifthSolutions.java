import java.util.Scanner;

public class FifthSolutions {
    public static int sumOfNumbers(int number) {
        int remainder, sum;
        sum = number % 10;
        remainder = number / 10;
        if (remainder == 0) {
            return sum;
        }
        return sumOfNumbers(remainder, sum);
    }

    private static int sumOfNumbers(int remainder, int sum) {
        sum += remainder % 10;
        remainder /= 10;
        if (remainder == 0) {
            return sum;
        } else {
            return sumOfNumbers(remainder, sum);
        }
    }

    public static void printAllTillN(int n) {
        for (int i = 1; i < n + 1; i++) {
            System.out.print(i);
            if (i != n) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void printInRangeAB(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        }
        else {
            for (int i = a; i >= b; i--) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("5) Number: ");
        int number = sc.nextInt();
        System.out.printf("Answer is: %d%n", FifthSolutions.sumOfNumbers(number));

        System.out.print("2) n: ");
        number = sc.nextInt();
        FifthSolutions.printAllTillN(number);

        System.out.print("3) A: ");
        number = sc.nextInt();
        System.out.print("-) B: ");
        int number1 = sc.nextInt();
        FifthSolutions.printInRangeAB(number, number1);
    }
}
