package app.game.logic;

import app.game.ui.UIController;

/**
 * GameCommands
 * 
 * Registry of Commands in the game
 */
public class GameCommands {

	UIController uic = new UIController();

	/**
	 * move() => Function for getting change in location
	 * 
	 * @param dirn Direction to move in
	 * @return Factor by which player should be moved
	 */
	public int[] move(String dirn) {
		dirn.toLowerCase();
		int[] moveFac = new int[2];

		switch (dirn) {
			case "up":
			case "u":
			case "n":
			case "north":
				moveFac[0] = 0;
				moveFac[1] = -1;
				break;

			case "down":
			case "d":
			case "s":
			case "south":
				moveFac[0] = 0;
				moveFac[1] = 1;
				break;

			case "left":
			case "l":
			case "w":
			case "west":
				moveFac[0] = -1;
				moveFac[1] = 0;
				break;

			case "right":
			case "r":
			case "e":
			case "east":
				moveFac[0] = 1;
				moveFac[1] = 0;
				break;

			default:
				System.out.println("Not a VALID DIRECTION");
				moveFac[0] = 0;
				moveFac[1] = 0;
				break;
		}

		return moveFac;
	}

	/**
	 * displayHelp() => Functionn to display help
	 */
	public void displayHelp() {

		uic.displayUI(1);
		System.out.println();

	}

	/**
	 * displayErr() => Functionn to display Invalid Input
	 */
	public void displayErr() {
		System.out.println("NOT a VALID COMMAND");
	}

	/**
	 * quitGame() => Functionn to display Thank you message for quitting and quitting the game
	 */
	public void quitGame() {
		System.out.println("THANKS FOR PLAYING!");
		System.exit(0);
	}
}
