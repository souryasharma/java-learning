package functions;

public class primeinrange {
    public static void primeR(int n){
        if(n<=1){ 
            System.out.println("not prime");
        }
        for(int i=2;i<=100;i++){
            if (n%i==0) {
                System.out.println("not prime");
               
                
            } 
            System.out.println("prime");


        }
        

    }
   public static void main(String[] args) {
    int range = 100;
    primeR(range);

   }
}
