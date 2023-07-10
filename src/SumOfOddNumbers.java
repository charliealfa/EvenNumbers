import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp;
        int sum = 0;
        System.out.println("Please enter number: ");
        do {
            temp = scan.nextInt();
            if (temp>=0 && temp%2==1)
                sum+=temp;
        }while (temp>=0);

        System.out.println("Sum of odd numbers : "+sum);
    }
}
