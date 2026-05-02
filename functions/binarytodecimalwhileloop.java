package functions;
import java.util.*;
public class binarytodecimalwhileloop { 
    public static int binarytodecimal(int n){
        int decimal=0;
        int pow=0;
    
       
        while (n>0) {
            int lastdigit=n%10;
            decimal=decimal+lastdigit* (int)Math.pow(2, pow);
             pow++;
            n=n/10;
            

            
        }
        return decimal;
    

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int result =binarytodecimal(n);
        System.out.println(result);


    }
    
}
