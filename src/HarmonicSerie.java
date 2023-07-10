import java.util.Scanner;

public class HarmonicSerie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number : ");

        int number = scan.nextInt();

        double result = 0.0;

        for (double i = 1.0; i <= number; i++) {
            result = result + (1 / i);
        }

        System.out.print("Hormonic serie result is : ");
        System.out.printf("%n$%.2f",result);
    }
}
