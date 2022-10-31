package Hashing;

import java.util.ArrayList;

public class DoubleHashing {
    String[] hashTable;
    int noOfCellUsedInHashTable;

    public DoubleHashing(int size) {
        hashTable = new String[size];
        noOfCellUsedInHashTable = 0;
    }


    //  Hash function to be used on Keys
    public int simpleASCIIHashFunction(String x, int M) {
        char ch[];
        ch = x.toCharArray();
        int i, sum;
        for (sum = 0, i = 0; i < x.length(); i++) {
            sum = sum + ch[i];
        }
        return sum % M;
    }

    public void rehashKeys(String newStringToBeInserted) {
        noOfCellUsedInHashTable = 0;
        ArrayList<String> data = new ArrayList<String>();
        for (String s : hashTable) {
            if (s != null) data.add(s);
        }
        data.add(newStringToBeInserted);
        hashTable = new String[hashTable.length * 2];
        for (String s1 : data) {
            insertKeyInHashTable(s1);
        }
    }

    // display the hash table
    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("\nHashtable does not exist");
            return;
        } else {
            System.out.println("\n-----------------Hashtable-----------------");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index " + i + ".  Key:" + hashTable[i]);
            }
        }
        System.out.println("\n");
    }

    private int addAllDigitsTogether(int sum) {
        int value = 0;
        while (sum > 0) {
            value = sum % 10;
            sum = sum / 10;
        }
        return value;
    }

    public int secondHashFunction(String x, int M) {
        char ch[];
        ch = x.toCharArray();
        int i, sum;
        for (sum = 0, i = 0; i < x.length(); i++) sum += ch[i];
        while (sum > hashTable.length) sum = addAllDigitsTogether(sum);
        return sum % M;
    }

    public double getLoadFactor() {
        return noOfCellUsedInHashTable * 1.0 / hashTable.length;
    }

    public void insertKeyInHashTable(String value) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehashKeys(value);
        } else {
            int x = simpleASCIIHashFunction(value, hashTable.length);
            int y = secondHashFunction(value, hashTable.length);

            for (int i = 0; i < hashTable.length; i++) {
                int newIndex = (x + i * y) % hashTable.length;
                if(hashTable[newIndex] == null) {
                    hashTable[newIndex] = value;
                    System.out.println(value + " inserted at location:" + newIndex);
                    break;
                } else {
                    System.out.println(newIndex + " is occupied. Try next empty index");
                }
            }
        }
        noOfCellUsedInHashTable++;
    }


}
