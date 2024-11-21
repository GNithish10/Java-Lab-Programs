class ArithmeticException extends Exception {
    public ArithmeticException(String Message){
        super(Message);
    }
}

public class ArithmeticException_L6{
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        int result = 0;
        try {
            if(b==0){
                throw new ArithmeticException("Error: Cannot divide by zero.");
            }
            result = a / b;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Done!");
        }
        System.out.println(result);
    }       
} 