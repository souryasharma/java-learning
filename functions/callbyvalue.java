package functions;

public class callbyvalue {
    public static int callbyvalue(int a, int b, int c){
        int result=a+b+c/300;
        return result;

    }
    public static void main(String[] args) {
        int x=90;
        int y=70;
        int z=100;
      callbyvalue(x, y, z);
      System.out.println(callbyvalue(x, y, z));
      
    }

    
    
}
