import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        int num = scan.nextInt();

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
