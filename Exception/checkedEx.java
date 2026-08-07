public class checkedEx {
    public static void main(String [] args){
        for (int i=1; i<5; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);// The sleep() method throws InterruptedException, which is a checked exception
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
    
}
}
