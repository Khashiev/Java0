package src.ex03;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String res = "";

        for (int i = 0; i < 18 && !str.equals("42"); i++) {
            if (str.codePointAt(5) - '0' != i + 1) {
                in.close();
                System.err.println("IllegalArgument");
                System.exit(-1);
            }

            String grade = in.nextLine();
            int minGrade = grade.codePointAt(0);

            for (int j = 0; j < 9; j += 2) {
                int code = grade.codePointAt(j);

                if (code < minGrade) {
                    minGrade = code;
                }
            }

            res += str + " ";
            for (int j = 0; j < minGrade - '0'; j++) {
                res += "=";
            }
            res += "> \n";

            str = in.nextLine();
        }

        in.close();
        System.out.print(res);
    }
}
