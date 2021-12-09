package app.game.logic;

import app.game.MainPlayer;
import app.game.ui.UIController;

/**
 * GameCommands
 * 
 * Registry of Commands in the game
 */
public class GameCommands {

	UIController uic = new UIController();
	String cmd = new String();

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
	private void displayHelp() {

		uic.displayUI(1);
		System.out.println();

	}

	/**
	 * displayErr() => Functionn to display Invalid Input
	 */
	private void displayErr() {
		System.out.println("NOT a VALID COMMAND");
	}

	/**
	 * quitGame() => Functionn to display Thank you message for quitting and quitting the game
	 */
	private void quitGame(MainPlayer mPlayer) {
		uic.displayQuit(mPlayer);
	}

	public void setCmd(String s) {
		cmd = s;
	}

	public int execCmd(MainPlayer mPlayer) {

		// getting words in uCmd using utils.getWords()
		String[] cmdWords = GameLogic.getWords(cmd);

		// Switc-case for command
		// Uses String based case
		// JDK > 8
		// Displays map with player location if player just moved
		switch (cmdWords[0]) {

			case "move":
			case "mov":
			case "mv":
				int[] moveadd = this.move(cmdWords[1]);
				mPlayer.movePlayer(moveadd[1], moveadd[0]);
				uic.displayMapGrid(mPlayer.Location);
				System.out.println();
				return 0;

			case "help":
			case "h":
				this.displayHelp();
				return 0;

			case "quit":
			case "exit":
			case "e":
			case "q":
				GameLogic.setDisplacement(mPlayer);
				this.quitGame(mPlayer);
				return 1;

			default:
				this.displayErr();
				return 0;

		}
	}
}
