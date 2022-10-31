package Hashing;

public class LinearProbMain {
    public static void main(String[] args) {
        LinearProbing linearProbing = new LinearProbing(12);
        linearProbing.insertKeyInHashTable("The");
        linearProbing.insertKeyInHashTable("quick");
        linearProbing.insertKeyInHashTable("brown");
        linearProbing.insertKeyInHashTable("fox");
        linearProbing.insertKeyInHashTable("over");
        linearProbing.deleteKeyHashTable("fox");
        linearProbing.displayHashTable();
    }
}
