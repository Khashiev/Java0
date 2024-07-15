package src.ex00;

public class Program {
    public static void main(String[] args) {
        int number = 479598;
        int sum = 0;

        for (int i = 0; i < 6; i++) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println(sum);
    }
}
