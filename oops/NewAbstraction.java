import java.util.Scanner;

abstract class Shape{
    float area;//variable to store area of shape
    abstract void calculateArea();//abstract method to calculate area of shape
    abstract void acceptInput();//abstract method to accept input from user
    void displayArea(){// concrete method to display area of shape(regular method)
        System.out.println("Area is: "+area);
    }
}
class Square extends Shape{
    float side;
    void acceptInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square: ");
        side = sc.nextFloat();
    }
    void calculateArea(){
        area = side*side;
    }
}
class Rectangle extends Shape{
    float length, breadth;
    void acceptInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        length = sc.nextFloat();
        System.out.println("Enter breadth of rectangle: ");
        breadth = sc.nextFloat();
    }
    void calculateArea(){
        area = length*breadth;
    }
}
class Area{
    void outputofshape(Shape s){
        s.acceptInput();
        s.calculateArea();
        s.displayArea();
    }
}

public class NewAbstraction {
    public static void main(String[] args) {
        Area a = new Area();
        Square sq = new Square();
        Rectangle r = new Rectangle();
        a.outputofshape(sq);
        a.outputofshape(r);
    }
    
}
