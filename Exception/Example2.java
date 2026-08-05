public class Example2 {
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(arr[0]);
        try{
            System.out.println(arr[5]);// the line that may throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {//solution to handle the exception
          System.out.println(e.getMessage());// prints thes hort exception message
            // e.printStackTrace(); - prints the complete exception message along with the line number where the exception occurred
            /*  System.out.println("Error: Array index is out of bounds.");*/
        }
        catch (Exception e) {// superclass of all exceptions, catches any other exception that may occur, always keep this catch block at the end of all catch blocks
            System.out.println("Error: An unexpected exception occurred.");
        }
    }
    
}
/*  Exception handling is a mechanism in Java that allows developers to handle runtime errors gracefully, 
preventing the program from crashing. In the provided code snippet, 
we have an array of integers and we attempt to access an index that is out of bounds
which will throw an `ArrayIndexOutOfBoundsException`.*/
/*  Exception allows one try block to be followed by multiple catch blocks, 
each designed to handle a specific type of exception. */
