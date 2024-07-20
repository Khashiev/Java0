package src.ex04;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int [] chars = new int[65535];
        int [] topTenCount = new int[10];
        char [] topTenCode = new char[10];

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        for (int i = 0; i < str.length(); i++) {
            int code = str.codePointAt(i);
            chars[code] += 1;
        }

        for (int i = 0; i < 10; i++) {
            char maxChar = ' ';
            int maxCount = 0;
            int index = 0;

            for (int j = 0; j < 65535; j++) {
                if (chars[j] > maxCount) {
                    maxCount = chars[j];
                    maxChar = (char) j;
                    index = j;
                }
            }

            topTenCount[i] = chars[index];
            topTenCode[i] = maxChar;
            chars[index] = 0;
        }

        printChars(topTenCode, topTenCount);
        in.close();
    }

    private static void printChars(char[] chars, int[] counts) {
        int max = counts[0];
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (counts[i] == max)
                System.out.print(max + "\t");
        }

        System.out.println();

        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < 10; j++) {
                if (counts[j] * 10 / max >= i)
                    System.out.print("#\t");
                if (counts[j] * 10 / max == i - 1) {
                    if (counts[j] != 0)
                        System.out.print(counts[j] + "\t");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(chars[i] + "\t");
        }
    }

}
