package functions;
import java.util.*;

public class evenodd {
    public static void iseven(int n){
        if (n%2==0) {
            System.out.println(true);
            
        } else { System.out.println(false);
            
        }
       
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        iseven(num);
    

    }
    
}
