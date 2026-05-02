package functions;
import java.util.*;
public class palindrome {
    public static void palindrome(int n){
        int rev=0;
        int pow=0;
        int original=n;
        while(n>0){
            int lastdigit=n%10;
            rev =rev+lastdigit*(int)Math.pow(10,pow);
            pow++;
            n=n/10;
            

        }
       
            if (rev==original) {
                System.out.println("your given number is palindrome");
                
            } else {
                 System.out.println("your given number is not a palindrome");
                
            }
        

    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number = ");

        int n = sc.nextInt();
        palindrome(n);

        
    }
}
