package day14.practice;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList<T extends Comparable<T>> {

    Node<T> head;
    Node<T> tail;

    // UC1 & UC2 - Add at Beginning
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // UC3 - Append at End
    public void append(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // UC4 - Insert Between Nodes
    public void insertAfter(T key, T data) {

        Node<T> temp = search(key);

        if (temp != null) {
            Node<T> newNode = new Node<>(data);

            newNode.next = temp.next;
            temp.next = newNode;

            if (temp == tail) {
                tail = newNode;
            }
        }
    }

    // UC5 - Delete First Element
    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    // UC6 - Delete Last Element
    public void popLast() {

        if (head == null)
            return;

        if (head == tail) {
            head = tail = null;
            return;
        }

        Node<T> temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
    }

    // UC7 - Search Node
    public Node<T> search(T key) {

        Node<T> temp = head;

        while (temp != null) {

            if (temp.data.equals(key)) {
                return temp;
            }

            temp = temp.next;
        }

        return null;
    }

    // UC9 - Delete Specific Node
    public void delete(T key) {

        if (head == null)
            return;

        if (head.data.equals(key)) {
            head = head.next;
            return;
        }

        Node<T> temp = head;

        while (temp.next != null) {

            if (temp.next.data.equals(key)) {
                temp.next = temp.next.next;
                break;
            }

            temp = temp.next;
        }
    }

    // Size of LinkedList
    public int size() {

        int count = 0;
        Node<T> temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // UC10 - Sorted Add
    public void sortedAdd(T data) {

        Node<T> newNode = new Node<>(data);

        if (head == null || head.data.compareTo(data) > 0) {
            newNode.next = head;
            head = newNode;

            if (tail == null)
                tail = newNode;

            return;
        }

        Node<T> temp = head;

        while (temp.next != null &&
                temp.next.data.compareTo(data) < 0) {

            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null)
            tail = newNode;
    }

    // Display LinkedList
    public void display() {

        Node<T> temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null)
                System.out.print(" -> ");

            temp = temp.next;
        }

        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // UC1
        System.out.println("UC1");
        list.add(70);
        list.add(30);
        list.add(56);
        list.display();

        // UC3
        System.out.println("\nUC3");
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.append(56);
        list2.append(30);
        list2.append(70);
        list2.display();

        // UC4
        System.out.println("\nUC4");
        LinkedList<Integer> list3 = new LinkedList<>();
        list3.append(56);
        list3.append(70);
        list3.insertAfter(56, 30);
        list3.display();

        // UC5
        System.out.println("\nUC5");
        list3.pop();
        list3.display();

        // UC6
        System.out.println("\nUC6");
        list2.popLast();
        list2.display();

        // UC7
        System.out.println("\nUC7");
        Node<Integer> found = list.search(30);

        if (found != null)
            System.out.println("Node Found: " + found.data);

        // UC8
        System.out.println("\nUC8");
        LinkedList<Integer> list4 = new LinkedList<>();
        list4.append(56);
        list4.append(30);
        list4.append(70);

        list4.insertAfter(30, 40);
        list4.display();

        // UC9
        System.out.println("\nUC9");
        list4.delete(40);
        list4.display();

        System.out.println("Size: " + list4.size());

        // UC10
        System.out.println("\nUC10");
        LinkedList<Integer> sortedList = new LinkedList<>();

        sortedList.sortedAdd(56);
        sortedList.sortedAdd(30);
        sortedList.sortedAdd(40);
        sortedList.sortedAdd(70);

        sortedList.display();
    }
}
