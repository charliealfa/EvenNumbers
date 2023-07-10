import java.util.Scanner;

public class DiamondWithStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");

        int num = scan.nextInt();

        for (int i = 0; i <=num; i++) {
            for (int j = 0; j < (num-i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*i+1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num-1; i >= 0; i--) {
            for (int j = num-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = (2*i+1); k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
