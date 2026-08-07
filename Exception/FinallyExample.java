public class FinallyExample {
    public static void main(String[] args){
        try{
            System.out.println(10/2);
            System.exit(0);// The program will terminate here, and the finally block will not be executed
        }catch (Exception e){
            System.out.println("Exception occurred: " );

    }
    
    finally {// The finally block is always executed, regardless of whether an exception occurred or not
        System.out.println("Finally block executed");
    }
}
}
