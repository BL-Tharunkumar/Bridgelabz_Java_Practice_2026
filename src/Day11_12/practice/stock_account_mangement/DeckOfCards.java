package Day11_12.practice.stock_account_mangement;

import java.util.Random;

public class DeckOfCards {
    static final String[] SUITS  = {"Clubs", "Diamonds", "Hearts", "Spades"};
    static final String[] RANKS  = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    static String[] buildDeck() {
        String[] deck = new String[52];
        int idx = 0;
        for (String suit : SUITS)
            for (String rank : RANKS)
                deck[idx++] = rank + " of " + suit;
        return deck;
    }

    static void shuffle(String[] deck) {
        Random rand = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            String tmp = deck[i]; deck[i] = deck[j]; deck[j] = tmp;
        }
    }

    public static void main(String[] args) {
        String[] deck = buildDeck();
        shuffle(deck);

        int numPlayers = 4, cardsEach = 9;
        // 2D array: [player][card]
        String[][] hands = new String[numPlayers][cardsEach];

        int cardIdx = 0;
        for (int c = 0; c < cardsEach; c++)
            for (int p = 0; p < numPlayers; p++)
                hands[p][c] = deck[cardIdx++];   // deal round-robin

        for (int p = 0; p < numPlayers; p++) {
            System.out.println("Player " + (p + 1) + ":");
            for (int c = 0; c < cardsEach; c++)
                System.out.println("  " + (c + 1) + ". " + hands[p][c]);
            System.out.println();
        }
    }
}
