package Hashing;

public class DoubleHashingMain {
    public static void main(String[] args) {
        DoubleHashing doubleHashing = new DoubleHashing(12);
        doubleHashing.insertKeyInHashTable("The");
        doubleHashing.insertKeyInHashTable("quick");
        doubleHashing.insertKeyInHashTable("brown");
        doubleHashing.insertKeyInHashTable("fox");
        doubleHashing.insertKeyInHashTable("over");
        doubleHashing.displayHashTable();

    }
}
