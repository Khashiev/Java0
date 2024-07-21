package src.ex05;

import java.util.Scanner;

public class Program {
    private static final int MAX_STUDENTS = 10;
    private static final int MAX_STUDENT_NAME_LENGTH = 10;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] students = parseStudents(in);

        for (int i = 0; students[i] != null; i++){
            System.out.println(students[i]);
        }
    }

    private static String[] parseStudents(Scanner in) {
        String[] students = new String[MAX_STUDENTS];
        String name = in.nextLine();

        for (int i = 0; !(name.equals(".")); i++) {
            if (i >= MAX_STUDENTS) {
                System.out.println("Too many students");
                System.exit(-1);
            }

            if (name.length() > MAX_STUDENT_NAME_LENGTH) {
                System.out.println("Invalid name");
                System.exit(-1);
            }

            students[i] = name;
            name = in.nextLine();
        }

        return students;
    }
}
