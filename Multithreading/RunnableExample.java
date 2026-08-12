import java.util.Scanner;
class ImplementingRunnable implements Runnable {
    @Override
    public void run() {
       Thread thread = Thread.currentThread();//get the current thread. 
       String name = thread.getName();
       if(name.equals("ADD")==true){
        add();
       }
       else if(name.equals("CHAR")==true){
        charprint();
       }
       else {
        numprint();
       }
    }

void add(){
    System.out.println("Addition of two numbers");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int a = sc.nextInt();
    System.out.println("Enter second number");
    int b = sc.nextInt();
    int c = a + b;
    System.out.println("Sum is: " + c);
    System.out.println("Addtion is done");
}
void charprint(){
    System.out.println("Printing characters");
    for(int i=65; i<=75; i++){
        System.out.print((char)i + " ");
    }
    try{
        Thread.sleep(4000);
    } catch (Exception e) {
        e.printStackTrace();
    }
    System.out.println("Character printing is done");
}
void numprint(){
    System.out.println("Printing numbers");
    for(int i=1; i<=10; i++){
        System.out.print(i + " ");
    }
    try{
        Thread.sleep(4000);
    } catch (Exception e) {
        e.printStackTrace();
    }
    System.out.println("Number printing is done");
}
}
public class RunnableExample {
    public static void main(String []args){
        ImplementingRunnable ir = new ImplementingRunnable();
        Thread t1 = new Thread(ir);
        Thread t2= new Thread(ir);
        Thread t3 = new Thread(ir);
        t1.setName("ADD");
        t2.setName("CHAR");
        t3.setName("NUM");
        t1.start();
        t2.start();
        t3.start();
    }
    
}
