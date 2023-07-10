import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter main number : ");
        int mainNum = scan.nextInt();
        System.out.println("Please enter combination number : ");
        int combinationNum = scan.nextInt();

        System.out.println("combination of mainNum to combinationNum = " + combination(mainNum, combinationNum));

    }

    public static int factorial(int x) {
        int result = 1;

        for (int i = 1; i <=x; i++) {
            result*=i;
        }
        return result;
    }

    public static int combination(int x, int y) {
        return factorial(x) / (factorial(y) * factorial((x-y)));
    }
}
