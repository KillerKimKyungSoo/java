package collection.array.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CATACITY = 10;

    public static void main(String[] args) {
        LinkedList<Integer>[] buckets = new LinkedList[CATACITY];
        for(int i = 0 ; i<CATACITY;i++){
           buckets[i] = new LinkedList<>();
        }
        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); //중복
        System.out.println("buckets = " + Arrays.toString(buckets));
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        if (!bucket.contains(value)) { // O(n)
            bucket.add(value);
        }
    }
    private static boolean contains(LinkedList<Integer>[] buckets, int
            searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        return bucket.contains(searchValue); // O(n)
    }
    static int hashIndex(int value) {
        return value % CATACITY;
    }


}
