public class InterfaceAssignment {
    public static void main(String[] args) {

        Iphone iphone14 = new Iphone("iPhone 14", 2022);
        iphone14.printInfo();
        iphone14.sendMessage();
        iphone14.takePhoto();
        System.out.println("---------------------");
        SamsungGalaxy galaxy = new SamsungGalaxy("Samsung Galaxy 22", 2022);
        galaxy.printInfo();
        galaxy.sendMessage();
        galaxy.takePhoto();



    }
}

interface Message{
    void sendMessage();
}

interface ClickPhoto{
    void takePhoto();
}

class SmartPhone{

    private int year;
    private String model;

    SmartPhone(String model, int year){
        this.model = model;
        this.year = year;
    }

    void printInfo(){
        System.out.println("model name: " + this.model);
        System.out.println("year released: " + this.year);
    }

}

class Iphone extends SmartPhone implements Message, ClickPhoto{

    Iphone(String model, int year) {
        super(model, year);
    }

    @Override
    public void sendMessage() {
        System.out.println("Iphone is sending message thru imessage. ");
    }

    @Override
    public void takePhoto() {
        System.out.println("Iphone is taking photo in portrait mode.");
    }
}

class SamsungGalaxy extends SmartPhone implements Message, ClickPhoto{

    SamsungGalaxy(String model, int year) {
        super(model, year);
    }

    @Override
    public void sendMessage() {
        System.out.println("Samsung Galaxy is sending message. ");
    }

    @Override
    public void takePhoto() {
        System.out.println("Samsung Galaxy is taking photo in 100x zoom mode.");
    }
}
