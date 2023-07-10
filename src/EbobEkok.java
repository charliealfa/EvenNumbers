import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz : ");
        int num1 = scan.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        int num2 = scan.nextInt();
        int minNum = num1<=num2?num1:num2;
        int ebob = 0;


        while(minNum>0){
            if(num1%minNum==0&&num2%minNum==0&&minNum>ebob){
                ebob = minNum;
                minNum--;
            } else {
                minNum--;
            }
        }

        System.out.println("ebob = " + ebob);

        int ekok = num1*num2/ebob;

        System.out.println("ekok = " + ekok);
    }
}
