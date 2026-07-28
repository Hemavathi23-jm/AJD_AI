class car{
    private String name;
    private int mileage;
    private int cost;

    public void setDate(String x, int y, int z){
        name = x;
        mileage = y;
        cost = z;
    }

    public String getName(){
        return name;
    }
    public int getMileage(){
        return mileage;
    }
    public int getCost(){
        return cost;
    }
}

class Encapsulation{
    public static void main(String args[]){
        car c1 = new car();
        c1.setDate("BMW", 20, 5000000);
        System.out.println("Car name: " + c1.getName());
        System.out.println("Car mileage: " + c1.getMileage());
        System.out.println("Car cost: " + c1.getCost());
    }
}