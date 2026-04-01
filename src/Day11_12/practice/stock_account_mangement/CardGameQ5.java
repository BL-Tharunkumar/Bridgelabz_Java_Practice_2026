package Day11_12.practice.stock_account_mangement;

import java.util.Random;

// ── Card ─────────────────────────────────────────────────────────────────────
class Card {
    static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    static final String[] RANKS = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    private String suit;
    private String rank;
    private int rankValue; // 0-12 for sorting

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
        this.rankValue = getRankIndex(rank);
    }

    private static int getRankIndex(String rank) {
        for (int i = 0; i < RANKS.length; i++)
            if (RANKS[i].equals(rank)) return i;
        return -1;
    }

    public int getRankValue() { return rankValue; }

    @Override
    public String toString() { return rank + " of " + suit; }
}

// ── Generic Node ──────────────────────────────────────────────────────────────
class Node<T> {
    T data;
    Node<T> next;
    Node(T data) { this.data = data; }
}

// ── Custom LinkedList Queue (no Collections) ──────────────────────────────────
class LinkedQueue<T> {
    private Node<T> head, tail;
    private int size;

    public void enqueue(T item) {
        Node<T> node = new Node<>(item);
        if (tail != null) tail.next = node;
        tail = node;
        if (head == null) head = node;
        size++;
    }

    public T dequeue() {
        if (head == null) throw new RuntimeException("Queue is empty");
        T val = head.data;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return val;
    }

    public boolean isEmpty() { return head == null; }
    public int size() { return size; }
    public Node<T> getHead() { return head; }
}

// ── Player ────────────────────────────────────────────────────────────────────
class Player {
    private String name;
    private LinkedQueue<Card> hand = new LinkedQueue<>();

    public Player(String name) { this.name = name; }

    public void receiveCard(Card c) { hand.enqueue(c); }

    // Insertion sort on the linked list by rank value
    public void sortByRank() {
        if (hand.isEmpty()) return;

        // Collect all cards into an array
        int n = hand.size();
        Card[] arr = new Card[n];
        for (int i = 0; i < n; i++) arr[i] = hand.dequeue();

        // Insertion sort
        for (int i = 1; i < n; i++) {
            Card key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getRankValue() > key.getRankValue()) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        // Re-enqueue sorted
        for (Card c : arr) hand.enqueue(c);
    }

    public String getName() { return name; }
    public LinkedQueue<Card> getHand() { return hand; }
}

// ── Main ──────────────────────────────────────────────────────────────────────
public class CardGameQ5 {

    static Card[] buildAndShuffleDeck() {
        Card[] deck = new Card[52];
        int idx = 0;
        for (String suit : Card.SUITS)
            for (String rank : Card.RANKS)
                deck[idx++] = new Card(rank, suit);

        Random rand = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card tmp = deck[i]; deck[i] = deck[j]; deck[j] = tmp;
        }
        return deck;
    }

    public static void main(String[] args) {
        Card[] deck = buildAndShuffleDeck();

        // Create players and add to a player queue
        LinkedQueue<Player> playerQueue = new LinkedQueue<>();
        playerQueue.enqueue(new Player("Alice"));
        playerQueue.enqueue(new Player("Bob"));
        playerQueue.enqueue(new Player("Charlie"));
        playerQueue.enqueue(new Player("Diana"));

        // Temporarily store players to deal cards (round-robin)
        int numPlayers = 4, cardsEach = 9;
        Player[] players = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) players[i] = playerQueue.dequeue();

        int cardIdx = 0;
        for (int c = 0; c < cardsEach; c++)
            for (int p = 0; p < numPlayers; p++)
                players[p].receiveCard(deck[cardIdx++]);

        // Sort each player's hand and re-enqueue into player queue
        for (Player pl : players) {
            pl.sortByRank();
            playerQueue.enqueue(pl);
        }

        // Print from player queue
        System.out.println("======= CARD GAME - PLAYER HANDS (Sorted by Rank) =======\n");
        while (!playerQueue.isEmpty()) {
            Player pl = playerQueue.dequeue();
            System.out.println("Player: " + pl.getName());
            Node<Card> curr = pl.getHand().getHead();
            int num = 1;
            while (curr != null) {
                System.out.println("  " + num++ + ". " + curr.data);
                curr = curr.next;
            }
            System.out.println();
        }
    }
}
