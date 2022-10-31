package Hashing;

public class QuadraticProbingMain {
    public static void main(String[] args) {
        QuadraticProbing quadraticProbing = new QuadraticProbing(12);
        quadraticProbing.insertKeyHashTable("The");
        quadraticProbing.insertKeyHashTable("quick");
        quadraticProbing.insertKeyHashTable("brown");
        quadraticProbing.insertKeyHashTable("fox");
        quadraticProbing.insertKeyHashTable("over");
        quadraticProbing.insertKeyHashTable("lazy");
        quadraticProbing.displayHashTable();
    }

}
