package functions;
import java.util.*;
public class decimaltobinary {
    public static int decimaltobinary(int n){
        int pow=0;
        int bin=0;
        while (n>0){
            int rem=n%2;
            bin= bin+ rem* (int)Math.pow(10,pow);
            pow++;
            n=n/2;

        }
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int result=decimaltobinary(n);
        System.out.println(result);

    }
    
}
