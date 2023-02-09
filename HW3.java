public class HW3 {
    public static void main(String[] args) {

        Person michael = new Person("Michael", 23, "CEO");
        Person kamal = new Person("Kamal", 24, "Chairman");

        Car c1 = new Car(michael, "Mercedes", "G-wagon", 2022);
        c1.printInfo();

        Car c2 = new Car(kamal, "BMW", "X3", 2022);
        c2.printInfo();

    }
}

class Person{
    private String name;
    private int age;
    private String career;
//    private String
    Person(String name, int age, String career){
        this.name = name;
        this.age = age;
        this.career = career;
    }

    void printInfo(){
        System.out.println("name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("career: " + this.career);
        System.out.println("-----------------------");
    }

    String getName( ){
        return this.name;
    }


}

class Car{
    private String make;
    private int year;
    private String model;
    private Person owner;

    Car(Person owner, String model, String make, int year){
        this.owner = owner;
        this.make = make;
        this.year = year;
        this.model = model;
    }

    void printInfo(){
        this.owner.printInfo();
        System.out.println(this.owner.getName() + "'s car");
        System.out.println("Model: " + this.model);
        System.out.println("Make: " + this.make);
        System.out.println("Year: " + this.year);
        System.out.println("----------------");
    }
}