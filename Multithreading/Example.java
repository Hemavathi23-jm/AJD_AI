class Printer implements Runnable{
    synchronized public void run(){
        String name = Thread.currentThread().getName();
        System.out.println(name+"Started Printing");
        for(int i=1;i<=3;i++){
            System.out.println(name+" Printing "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name+" Finished Printing");
        }
    }
}
public class Example {
    public static void main(String[] args) {
        Printer p = new Printer();
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);  
        Thread t3 = new Thread(p);
        t1.setName("RUchitha");
        t2.setName("Suresh");
        t3.setName("Ramesh");
        t1.start();
        t2.start();
        t3.start();
    }
}