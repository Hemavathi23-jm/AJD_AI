import java.util.*;
class Student{
    int age;
    String name;
     Student(int age, String name){// constructor
        this.age = age;
        this.name = name;
}
}

public class ExForGenerics1 {
    public static void main(String[] args) {
        Student s1 = new Student(20, "John");
        Student s2 = new Student(22, "Alice");
        Student s3 = new Student(19, "Bob");
        
        ArrayList<Student> al = new ArrayList<>();//<Student> is a generic type parameter
        al.add(s1);
        al.add(s2);
        al.add(s3);
        //al.add(10);
        //al.add(20);
        for(Student s :al){
           // System.out.println(s);
           System.out.println("Name: " + s.name + ", Age: " + s.age);
        }
}
}
