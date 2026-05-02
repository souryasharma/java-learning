package functions;

import java.util.*;
public class binomialcoffecient {


    public static int factorial(int n ){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;

        }
        return fact;


    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
    int b=sc.nextInt(); 
  

     int binomialcoffecient=factorial(a)/(factorial(b)*factorial(a-b));
     System.out.println(binomialcoffecient);

  
       
    }
    
    
}
    

