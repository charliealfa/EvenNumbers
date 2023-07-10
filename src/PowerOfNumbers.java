import java.util.Scanner;

public class PowerOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Kuvveti alınacak sayıyı giriniz : ");
        int number = scan.nextInt();
        System.out.print("Kuvvet sayısını giriniz : ");
        int power = scan.nextInt();

        int result = (int) Math.pow(number,power);

        System.out.println(String.format("Number %1$s, power of %2$s is ",number,power) + result);
    }
}
