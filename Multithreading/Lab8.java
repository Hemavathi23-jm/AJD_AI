class Average extends Thread{
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        double average = sum / 10.0;
        System.out.println("Average of first 10 natural numbers is: " + average);
    }

}
class Square extends Thread{
    public void run(){
        int arr[] = {1, 20, 50, 15, 30};
        System.out.println("Square of the numbers :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] * arr[i] + " ");
        }
        System.out.println();
    }
}
public class Lab8 {
    public static void main(String[] args) throws Exception {
        Average avg= new Average();
        Square sqr = new Square();

        avg.start();
        sqr.start(); // Calling start() to begin thread execution
    }
    
}
