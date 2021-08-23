package snakeandladder;

import java.util.Random;

public class SnakeAndLadder {
	public static void main(String[] args) {
		int playerOnePosition = 0, playerTwoPosition = 0;
		int noPlay = 1;
		int ladder = 2;
		// int snake = 3;
		int count = 1;

		Random random = new Random();

		while (playerOnePosition < 100 && playerTwoPosition < 100) {
			count++;

			int condition = random.nextInt(4 - 1) + 1;
			int dice = random.nextInt(7 - 1) + 1;

			// System.out.println("Player" + " " + (count%2+1) + " " + "Dice number is : " +
			// dice);
			System.out.println("Player" + " " + (count % 2 + 1) + " " + "Dice number is : " + dice);
			if (condition == noPlay) {
				System.out.println("You got No-Play Option! " + " " + "Player" + " " + (count % 2 + 1));
			} else if (condition == ladder) {
				System.out.println("Player " + (count % 2 + 1) + " got Ladder!");
				if (count % 2 == 0) {
					playerOnePosition += dice;
					System.out.println("Curruent position is : " + playerOnePosition);
					if (playerOnePosition > 100) {
						playerOnePosition -= dice;
						System.out.println("Since it is greater than 100, his postion is : " + playerOnePosition);
					}
				} else {
					playerTwoPosition += dice;
					System.out.println("Curruent position is : " + playerTwoPosition);
					if (playerTwoPosition > 100) {
						playerTwoPosition -= dice;
						System.out.println("Since it is greater than 100, his postion is : " + playerTwoPosition);
					}
				}
				count--;
			} else {
				System.out.println("Player" + " " + (count % 2 + 1) + " " + "You got Snake!");
				if (count % 2 == 0) {
					playerOnePosition -= dice;
					System.out.println("Curruent position is : " + playerOnePosition);
					if (playerOnePosition < 0) {
						playerOnePosition = 0;
						System.out.println("Since it is less than 0, his postion is : " + playerOnePosition);
					}
				} else {
					playerTwoPosition -= dice;
					System.out.println("Curruent position is : " + playerTwoPosition);
					if (playerTwoPosition < 0) {
						playerTwoPosition = 0;
						System.out.println("Since it is less than 0, his postion is : " + playerTwoPosition);
					}
				}
			}
		}
		System.out.println("Curruent position of player 1 is : " + playerOnePosition);
		System.out.println("Curruent position of player 2 is : " + playerTwoPosition);
		// System.out.println("Dice rolled "+(count-1)+" times");
		if (playerOnePosition == 100) {
			System.out.println("Player 1 won.");
		} else {
			System.out.println("Player 2 won.");
		}
	}
}