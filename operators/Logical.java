public class Logical{
    public static void main(String [] args){
        
        int a=10;
        int b=20;
         //Logical Operators
        System.out.println("10>5 && 20>15: " + (a>5 && b>15));//true
        System.out.println("10>5 || 20<15: " + (a>5 || b<15));//true
        System.out.println("!(10>5): " + !(a>5));//false
    }
}
