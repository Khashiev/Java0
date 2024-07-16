package src.ex02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int queryCount = 0;

        while (num != 42) {
            if (checkPrime(sumOfDigits(num))) queryCount++;
            num = in.nextInt();
        }

        in.close();
        System.out.println("Count of coffee-request – " + queryCount);
    }


    private static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    private static boolean checkPrime(int num) {
        boolean isPrime = true;
        int iter = 1;

        for(int i = 2; i <= Math.floor(Math.sqrt(num)); i++, iter++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}

