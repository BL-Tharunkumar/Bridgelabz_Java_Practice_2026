package day16_17.practice;

import java.util.HashSet;
import java.util.TreeSet;

public class DataStructureSearchComparison {

    // Array Linear Search
    public static boolean arraySearch(int[] arr, int target) {

        for (int num : arr) {

            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int size = 1000000;

        int[] array = new int[size];

        HashSet<Integer> hashSet = new HashSet<>();

        TreeSet<Integer> treeSet = new TreeSet<>();

        // Insert Data
        for (int i = 0; i < size; i++) {

            array[i] = i;

            hashSet.add(i);

            treeSet.add(i);
        }

        int target = 999999;

        // ---------------- Array Search ----------------
        long startArray = System.currentTimeMillis();

        boolean arrayFound = arraySearch(array, target);

        long endArray = System.currentTimeMillis();

        // ---------------- HashSet Search ----------------
        long startHashSet = System.currentTimeMillis();

        boolean hashFound = hashSet.contains(target);

        long endHashSet = System.currentTimeMillis();

        // ---------------- TreeSet Search ----------------
        long startTreeSet = System.currentTimeMillis();

        boolean treeFound = treeSet.contains(target);

        long endTreeSet = System.currentTimeMillis();

        // ---------------- Output ----------------
        System.out.println("Array Search Found: " + arrayFound);

        System.out.println("Array Search Time: "
                + (endArray - startArray) + " ms");

        System.out.println();

        System.out.println("HashSet Search Found: " + hashFound);

        System.out.println("HashSet Search Time: "
                + (endHashSet - startHashSet) + " ms");

        System.out.println();

        System.out.println("TreeSet Search Found: " + treeFound);

        System.out.println("TreeSet Search Time: "
                + (endTreeSet - startTreeSet) + " ms");
    }
}
