import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number : ");

        String number = scan.next();

        int a = calculateSumOfDigit(number);
        int b = Integer.parseInt(number);

        if(a==b){
            System.out.println(number+" is an Armstrong number");
        } else {
            System.out.println(number+" is not an Armstrong number");
        }

    }

    public static int calculateSumOfDigit(String x){
        int result = 0;
        int temp;
        for (int i = x.length()-1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(x.charAt(i)));
            temp = (int) Math.pow(digit,x.length());
            result+=temp;
        }
        return result;
    }
}
