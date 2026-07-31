abstract class Plane{
    abstract void takeoff();
    abstract void fly();
    abstract void landing();
}
class CargoPlane extends Plane{/*it will throw an error if any of the
                                   abstract methods are not implemented */
    void takeoff(){
        System.out.println("Cargo Plane is taking off");/* it can also be partially implemented by making the class as abstract */
    }
    void fly(){
        System.out.println("Cargo Plane is flying");
    }
    void landing(){
        System.out.println("Cargo Plane is landing");
    }
}
class PassengerPlane extends Plane{
    void takeoff(){
        System.out.println("Passenger Plane is taking off");
    }
    void fly(){
        System.out.println("Passenger Plane is flying");
    }
    void landing(){
        System.out.println("Passenger Plane is landing");
    }
}
class Airport{
    void permit(Plane p){
        p.takeoff();
        p.fly();
        p.landing();
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Airport a = new Airport();
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        a.permit(cp);
        a.permit(pp);
    }
    
}
