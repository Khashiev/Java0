package src.ex01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num <= 1) {
            System.out.println("IllegalArgument");
            System.exit(-1);
        } else {
            boolean isPrime = true;
            int iter = 1;

            for(int i = 2; i <= Math.floor(Math.sqrt(num)); i++, iter++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            System.out.println(isPrime + " " + iter);
        }

        in.close();
    }
}
