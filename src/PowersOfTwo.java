import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp;
        int powerOf2 = 1;
        System.out.println("Please enter a positive number : ");
        temp = scan.nextInt();

        do {
            if (powerOf2 * 2 <= temp) {
                powerOf2 *= 2;
                System.out.print(powerOf2 + " ");
            }
        } while (powerOf2 * 2 <= temp);
    }
}
