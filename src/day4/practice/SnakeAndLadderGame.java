package day4.practice;

public class SnakeAndLadderGame {
    public static void main(String[] args) {

        int player1Position = 0;
        int player2Position = 0;

        int currentPlayer = 1;
        int diceCount = 0;

        final int WIN_POSITION = 100;

        System.out.println("Snake and Ladder Game Started!");

        while (player1Position < WIN_POSITION && player2Position < WIN_POSITION) {

            // Roll Dice (UC 1)
            int dice = (int) (Math.random() * 6) + 1;

            diceCount++;

            // Check Option (UC 2)
            int option = (int) (Math.random() * 3);

            System.out.println("\nPlayer " + currentPlayer +
                    " rolled dice: " + dice);

            if (currentPlayer == 1) {
                player1Position = movePlayer(player1Position, dice, option);
                System.out.println("Player 1 Position: " + player1Position);

                // Change turn only if not ladder
                if (option != 1) {
                    currentPlayer = 2;
                }
            } else {
                player2Position = movePlayer(player2Position, dice, option);
                System.out.println("Player 2 Position: " + player2Position);

                if (option != 1) {
                    currentPlayer = 1;
                }
            }
        }

        // UC 7 – Declare Winner
        if (player1Position == WIN_POSITION) {
            System.out.println("\n🎉 Player 1 WON the game!");
        } else {
            System.out.println("\n🎉 Player 2 WON the game!");
        }

        System.out.println("Total Dice Rolls: " + diceCount);
    }

    // Method to move player
    public static int movePlayer(int position, int dice, int option) {

        switch (option) {

            case 0: // No Play
                System.out.println("Option: No Play");
                break;

            case 1: // Ladder
                System.out.println("Option: Ladder");
                position += dice;
                break;

            case 2: // Snake
                System.out.println("Option: Snake");
                position -= dice;
                break;
        }

        // UC 3 – If position < 0 reset to 0
        if (position < 0) {
            position = 0;
        }

        // UC 4 – Exact 100 required
        if (position > 100) {
            position -= dice;
        }

        return position;
    }
}
