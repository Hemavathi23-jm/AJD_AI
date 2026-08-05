import java.util.Scanner;
public class Demo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);
        System.out.print("Enter a number: ");
        int den = scanner.nextInt();
        System.out.println("You entered: " + den);
       try{
            System.out.println("Result: " + (num / den));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}