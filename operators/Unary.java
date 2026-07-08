public class Unary{
    public static void main(String [] args){
        int n1 = 20;
        int n2 = n1++ + ++n1 + --n1 + ++n1 + n1++ +n1++;
        System.out.println("n1 = " + n1);//24
        System.out.println("n2 = " + n2);//130
    }
}   /*Post Increment and Decrement Operators = first assign then increment/decrement
      Pre Increment and Decrement Operators = first increment/decrement then assign */ 
