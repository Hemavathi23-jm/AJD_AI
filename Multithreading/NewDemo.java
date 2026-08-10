
/*using multithreading we can run multiple threads parallely. 
In this example we are running 3 threads parallely. 
One thread is for addition of two numbers, second thread is for printing characters from A to Z 
and third thread is for printing numbers from 1 to 10. All three threads will run parallely and
 will not wait for each other to complete their execution.*/
import java.util.Scanner;

class Demo  extends Thread {//extends Thread class to create a thread, using of "thread class" is one way to create a thread in java. Another way is to implement "Runnable" interface.
     public void run() {//overriding run() method of Thread class. run() method is the entry point for a thread.

        System.out.println("Addition started");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first numbe:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("Sum of two numbers is: " + sum);
        System.out.println("Addition completed");
}
}
class Demo2 extends Thread {

    public void run() {
        System.out.println("Character printing started");
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
        System.out.println("Character printing completed");
    }
}
class Demo3 extends Thread {
    public void run() {
        System.out.println("Number printing started");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Number printing completed");
    }
}

 public class NewDemo{
    public static void main(String[] args)  throws Exception{
        Demo d1 = new Demo();
        Demo2 d2 = new Demo2();
        Demo3 d3 = new Demo3();
        d1.start();//start() method is used to start a thread. It will call run() method of the thread class.
        d2.start();
        d3.start();
    }
}
/* example of multithreading with 3 different functions to be executed in parallel 
makes use of multithreading , extends Thread class, overrides run() method, starts threads */

