import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();

        int total = 0;

        for (int i = 1; i <= num/2; i++){
            if(num%i==0)
                total += i;
        }

        if (total==num)
            System.out.println(num+" is a perfect number");
        else
            System.out.println(num+" is not a perfect number");

    }
}
