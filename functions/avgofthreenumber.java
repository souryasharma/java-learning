package functions;
import java.util.*;
public class avgofthreenumber {
    public static int average(int a, int b, int c){
        int average= (a+b+c)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your first number value = ");
        int a=sc.nextInt();
         System.out.println("enter your second number value = ");
        int b=sc.nextInt();
        System.out.println("enter your third number value = ");
        int c= sc.nextInt();
        int result=average(a, b, c);
System.out.println(result);

    }
    
}
