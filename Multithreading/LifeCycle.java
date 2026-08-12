public class LifeCycle{
    public static void main(String [] args){
        System.out.println("Main thread starting.");
        Thread.sleep(6000);
        System.out.println("Main thread ending.");
        Thread.currentThread().interrupt();
        Thread.sleep(5000);
        System.out.println("Main thread ending.");
    }
}