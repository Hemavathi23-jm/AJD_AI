

import java.util.Scanner;

class Demo {
    void func1() throws Exception {

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
class Demo2{
   void func2() throws Exception {
        System.out.println("Character printing started");
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
            Thread.sleep(4000);
        
        }
        System.out.println("Character printing completed");
    }
}
class Demo3{
    void func3() throws Exception {
        System.out.println("Number printing started");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            Thread.sleep(4000);
        }
        System.out.println("Number printing completed");
    }
}

 public class Demo1 {
    public static void main(String[] args)  throws Exception{
        Demo d1 = new Demo();
        Demo2 d2 = new Demo2();
        Demo3 d3 = new Demo3();
        d1.func1();
        d2.func2();
        d3.func3();
    }
}
/* example of multithreading with 3 different functions to be executed in parallel but it does not
  use multithreading effectively */
