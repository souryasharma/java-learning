package functions;
import java.util.*;


public class prime {

    public static void prime(int n) {

        if (n <= 1) {
            System.out.println("not prime");
            return;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("not prime");
                return;
            }
        }

        System.out.println("prime");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime(n);
    }
}
