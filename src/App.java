import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter an integer : ");
        int num = scan.nextInt();

        for (int i = 1; i < num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
