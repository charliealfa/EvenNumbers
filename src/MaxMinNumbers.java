import java.util.Scanner;

public class MaxMinNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        int numCount = scan.nextInt();
        System.out.print("1. Sayıyı Giriniz : ");
        int numTemp = scan.nextInt();

        int min = numTemp;
        int max = numTemp;
        for (int i = 2; i <= numCount; i++) {
            System.out.print(i+". Sayıyı Giriniz : ");
            int num = scan.nextInt();

            if(num>max)
                max = num;

            if(num<min)
                min = num;
        }

        System.out.println("Max number is : "+max);
        System.out.println("Min number is : "+min);
    }
}
