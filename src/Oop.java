import encapsulation.EncapsulationIntro;

public class Oop {
    public static void main(String[] args) {
        // Person p1 = new Person();
        // p1.name = "Trunks";
        // p1.age = 12;
        // System.out.println(p1.age + " " + p1.name);
        // p1.walk();
        // System.out.println(Person.hobby + Person.no)

        // Developer d1 = new Developer(16, "John");
        // d1.learning();

        EncapsulationIntro obj = new EncapsulationIntro();
        obj.doWork();
    }
}

class Developer extends Person {
    public Developer(int age, String name) {
        super(age, name);
    }

    void learning() {
        System.out.println(name + " " + age + " years old " + "learning java");
    }
}

class Person {
    String name;
    int age;
    static int no = 0;
    static String hobby = "gaming";

    public Person() {
        no++;
        System.out.println("constructor");
    }

    public Person(int age, String name) {
        // this(); // it used to call the previous constructor with no parameter thus no argument has given here
        this.age = age;
        this.name = name;
    }

    void walk() {
        System.out.println("walking");
    }

    // polymorphism i.e. function overloading
    void walk (int steps) {
        System.out.println(name + " walked " + steps);
    }

    void talk() {
        System.out.println("talking");
    }
}

//abstraction = data hiding to reduce complexities