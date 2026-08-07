
public class Example1 {
    static void div () throws ArithmeticException{// The div() method throws an ArithmeticException, which is an unchecked exception
        System.out.println(10/0);
    }
    public static void main (String[] args){
        try{
            div();// Calling the div() method, which may throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic exception occurred.");
        }
    }
    
}
