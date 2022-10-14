package abstraction;

public class AbstractionIntro {
    public static void main(String[] args) {
        // Car c = new Car(); // abstract class can't be instantiated rather used by its derived class
        // c.start();

        Toyota t = new Toyota();
        t.start();
        BMW b = new BMW();
        b.start();
    }
}

class Toyota extends Car {

    @Override
    void start() {
        System.out.println("Toyota starting");
    }
}

class BMW extends Car {

    @Override
    void start() {
        System.out.println("BMW starting");
    }
}

abstract class Car {
    String brand;
    int price;

    abstract void start ();

}