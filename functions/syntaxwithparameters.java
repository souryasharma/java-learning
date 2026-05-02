package functions;
import java.util.*;


public class syntaxwithparameters {

    public static void calculatesum(int num1, int num2) { //parameters or formal parameters
        int sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        calculatesum(a, b);// arguements or actual parameter

        sc.close();
    }
}

    

