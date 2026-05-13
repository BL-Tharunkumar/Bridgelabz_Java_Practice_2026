package day15.practice;

import java.util.LinkedList;

class MyMapNode<K, V> {
    K key;
    V value;

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

class MyHashTable<K, V> {

    private final int size = 10;

    LinkedList<MyMapNode<K, V>>[] buckets;

    public MyHashTable() {

        buckets = new LinkedList[size];

        for (int i = 0; i < size; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // Hash Function
    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % size;
    }

    // Add or Update
    public void add(K key, V value) {

        int index = getIndex(key);

        for (MyMapNode<K, V> node : buckets[index]) {

            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }

        buckets[index].add(new MyMapNode<>(key, value));
    }

    // Get Value
    public V get(K key) {

        int index = getIndex(key);

        for (MyMapNode<K, V> node : buckets[index]) {

            if (node.key.equals(key)) {
                return node.value;
            }
        }

        return null;
    }

    // Remove Key
    public void remove(K key) {

        int index = getIndex(key);

        buckets[index].removeIf(node -> node.key.equals(key));
    }

    // Display HashTable
    public void display() {

        for (LinkedList<MyMapNode<K, V>> bucket : buckets) {

            for (MyMapNode<K, V> node : bucket) {
                System.out.println(node.key + " : " + node.value);
            }
        }
    }
}

public class HashTableMain {

    public static void main(String[] args) {

        // UC1
        System.out.println("UC1");

        String sentence = "To be or not to be";

        MyHashTable<String, Integer> map = new MyHashTable<>();

        String[] words = sentence.toLowerCase().split(" ");

        for (String word : words) {

            Integer count = map.get(word);

            if (count == null)
                map.add(word, 1);
            else
                map.add(word, count + 1);
        }

        map.display();

        // UC2
        System.out.println("\nUC2");

        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        MyHashTable<String, Integer> map2 = new MyHashTable<>();

        String[] paraWords = paragraph.toLowerCase().split(" ");

        for (String word : paraWords) {

            Integer count = map2.get(word);

            if (count == null)
                map2.add(word, 1);
            else
                map2.add(word, count + 1);
        }

        map2.display();

        // UC3
        System.out.println("\nUC3");

        map2.remove("avoidable");

        System.out.println("After Removing 'avoidable'");

        map2.display();
    }
}
