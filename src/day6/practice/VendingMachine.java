package day6.practice;

public class VendingMachine {
    static int count = 0;
    static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};

    public static void findNotes(int amount, int index) {

        // Base condition
        if (amount == 0 || index == notes.length) {
            return;
        }

        if (amount >= notes[index]) {
            int num = amount / notes[index];
            count += num;

            System.out.println(notes[index] + " Rs note x " + num);

            amount = amount % notes[index];
        }

        // Recursive call
        findNotes(amount, index + 1);

    }
    public static void main(String[] args) {
        int amount = 289;

        System.out.println("Change Amount: " + amount);
        findNotes(amount, 0);
        System.out.println("Minimum number of notes required: " + count);
    }
}
