package day15.practice;

class BSTNode<T extends Comparable<T>> {

    T data;
    BSTNode<T> left;
    BSTNode<T> right;

    public BSTNode(T data) {
        this.data = data;
        left = right = null;
    }
}

class BinarySearchTree<T extends Comparable<T>> {

    BSTNode<T> root;

    // Insert Node
    public void add(T data) {
        root = addRecursive(root, data);
    }

    private BSTNode<T> addRecursive(BSTNode<T> current, T data) {

        if (current == null) {
            return new BSTNode<>(data);
        }

        if (data.compareTo(current.data) < 0) {
            current.left = addRecursive(current.left, data);
        } else if (data.compareTo(current.data) > 0) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }

    // Size of BST
    public int size() {
        return sizeRecursive(root);
    }

    private int sizeRecursive(BSTNode<T> node) {

        if (node == null)
            return 0;

        return 1 + sizeRecursive(node.left)
                + sizeRecursive(node.right);
    }

    // Search Node
    public boolean search(T key) {
        return searchRecursive(root, key);
    }

    private boolean searchRecursive(BSTNode<T> node, T key) {

        if (node == null)
            return false;

        if (node.data.equals(key))
            return true;

        if (key.compareTo(node.data) < 0)
            return searchRecursive(node.left, key);

        return searchRecursive(node.right, key);
    }

    // Inorder Display
    public void display() {
        inorder(root);
        System.out.println();
    }

    private void inorder(BSTNode<T> node) {

        if (node != null) {

            inorder(node.left);

            System.out.print(node.data + " ");

            inorder(node.right);
        }
    }
}

public class BSTMain {

    public static void main(String[] args) {

        BinarySearchTree<Integer> bst =
                new BinarySearchTree<>();

        // UC1
        bst.add(56);
        bst.add(30);
        bst.add(70);

        System.out.println("BST Elements:");
        bst.display();

        // UC2
        bst.add(22);
        bst.add(40);
        bst.add(60);
        bst.add(95);
        bst.add(11);
        bst.add(65);
        bst.add(3);
        bst.add(16);
        bst.add(63);
        bst.add(67);

        System.out.println("\nAfter Adding More Nodes:");
        bst.display();

        System.out.println("Size of BST: " + bst.size());

        // UC3
        System.out.println("\nSearch 63:");

        boolean found = bst.search(63);

        if (found)
            System.out.println("63 Found in BST");
        else
            System.out.println("63 Not Found");
    }
}