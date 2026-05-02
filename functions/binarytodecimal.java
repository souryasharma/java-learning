package functions;
import java.util.*;
public class binarytodecimal {

    public static int binarytodecimal(int n){
        int decimal=0;
        for(int pow=0;n>0;pow++){
           int lastdigit=n%10;
          
           decimal=decimal+lastdigit* (int) Math.pow(2, pow);;
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
