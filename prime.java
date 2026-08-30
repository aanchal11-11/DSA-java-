import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            boolean isPrime = true;
            if (n < 2) {
                isPrime = false;
            } 
            else {
                for (int div = 2; div * div <= n; div++) {

                    if (n % div == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println("Prime");
            } 
            else {
                System.out.println("Not Prime");
            }
        }

        sc.close();
    }
}