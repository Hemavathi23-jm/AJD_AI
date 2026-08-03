 sealed  abstract class Employee permits Manager, Developer, Tester{
    abstract void role();
}
 final class Manager extends Employee {
 
    void role() {
        System.out.println("Manager: Manages the team and projects.");
    }
}
 non-sealed class Developer extends Employee {
 
    void role() {
        System.out.println("Developer: Writes code and develops software.");
    }
}
 final class Tester extends Employee {
 
    void role() {
        System.out.println("Tester: Tests the software for bugs and issues.");
    }
}
public class SealedClassExample {
    public static void main(String[] args) {
        Employee m = new Manager();
        Employee d= new Developer();
        Employee t= new Tester();

        m.role();
        d.role();
        t.role();
    }
}