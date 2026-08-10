import java.util.Scanner;

public class ExOfMultiThreading {
    public static void main(String[] args)  throws Exception {

        System.out.println("Addition started");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first numbe:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("Sum of two numbers is: " + sum);
        System.out.println("Addition completed");
        System.out.println("Character printing started");
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
            Thread.sleep(4000);
        
        }
        System.out.println("Character printing completed");
        System.out.println("Number printing started");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            Thread.sleep(4000);
        }
        System.out.println("Number printing completed");
    }
}

/*example of multithreading with 3 different functions  as one to be executed in parallel but it does not
  use multithreading effectively */


