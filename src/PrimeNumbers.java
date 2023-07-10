public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            int k = 0;
            for (double j = i; j > 1; j--) {
                if(i%j==0)
                    k++;
            }
            if (k==1)
                System.out.print(i+" ");
        }
    }
}
