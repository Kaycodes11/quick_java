package encapsulation;

//encapsulation : data hiding for security reasons using accessor i.e. private/public,protected, static
public class EncapsulationIntro {
    public static void main(String args[]) {
        Laptop la = new Laptop();
        la.setPrice(250000);
        la.setRam(16);
        System.out.println(la.getPrice() + " " + la.getRam());
    }

    public void doWork() {
        System.out.println("working encapsulation");
    }
}

class Laptop {
    int ram;
    private int price;

    public void setPrice(int price) {
        // is the user admin?
        boolean isAdmin = true;
        if(!isAdmin) {
            System.out.println("You are not allowed");
        } else {
            this.price = price;
        }
    }
    public int getRam() {
        return ram;
    }

    public void setRam (int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }
}