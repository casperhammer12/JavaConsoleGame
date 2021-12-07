package app.game.logic;

import app.game.ui.UIController;

public class GameCommands {

	UIController uic = new UIController();

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

	public void displayHelp() {

		uic.displayUI(1);
		System.out.println();

	}

	public void displayErr() {
		System.out.println("NOT a VALID COMMAND");
	}

	public void quitGame() {
		System.out.println("THANKS FOR PLAYING!");
		System.exit(0);
	}
}
