package functions;
import java.util.*;
public class product {
    public static int product(int a, int b ){
        int product=a*b;
        return product;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int u=sc.nextInt();
        product(y, u);
        int result=product(y, u);
        System.out.println(result);

    }
    
}
