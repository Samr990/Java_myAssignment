public class HW4 {
    public static void main(String[] args) {

        Cars c = new Cars();
        c.ridingCar();

        Bus b = new Bus(45);
        b.ridingBus();

    }
}

class Vehicle{
    private String type;
    private String make;

    Vehicle(){
        System.out.println("Vehicle constructor called...");
    }

    Vehicle(String type, String make){
        this.make = make;
        this.type = type;
    }


}

class Cars extends Vehicle{
    private int numOfWheels;
    private String model;
    private int year;

    Cars(){
        super();
        System.out.println("Cars constructor called...");
    }

    Cars(String type, String make, String model, int numOfWheels , int year){
        super(type, make);
        this.model = model;
        this.numOfWheels = numOfWheels;
        this.year = year;
        System.out.println("Cars constructor called...");
    }

    void ridingCar(){
        System.out.println("You are riding a family car..");
        System.out.println("------------------");
    }

}

class Bus extends Vehicle{
    private int numOfCustomers;

    Bus(){
        System.out.println("Bus constructor called...");

    }
    Bus(int numOfCustomers){
        super();
        this.numOfCustomers = numOfCustomers;
        System.out.println("Bus constructor called...");

    }
    void ridingBus(){

        System.out.println("there are "+ this.numOfCustomers + " riding the bus.");
        System.out.println("--------------------");
    }
}