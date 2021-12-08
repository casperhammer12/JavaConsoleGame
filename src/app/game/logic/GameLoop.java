package app.game.logic;

import java.util.Scanner;

import app.game.MainPlayer;
import app.game.ui.UIController;

/**
 * Class GameLoop
 * 
 * Runs the main loop for the game
 * 
 * @param mPlayer player
 * @param uCmd command given by user
 * @param uic UI Controller
 * @param ut Object for accessing utility functions
 * @param sc Scanner object for getting Input from User
 */

public class GameLoop {

	// Declaring the class variables
	MainPlayer mPlayer;
	String uCmd = "";
	UIController uic = new UIController();
	utils ut = new utils();
	Scanner sc = new Scanner(System.in);

	/**
	 * mainLoop() => The game loop. Here user input is handled and commands are passed to the
	 * appropriate classes
	 * 
	 * @return void
	 */
	public void mainLoop() {

		String pName;

		// Displaying opening UI
		uic.displayUI(0);

		// Asking user for playe name
		System.out.print("ENTER PLAYER NAME >> ");
		pName = sc.nextLine();

		mPlayer = new MainPlayer(pName);

		System.out.println();

		uCmd = "help";
		execCmd();

		// System.out.println(mPlayer.playerName);

		// Command Loop
		// Here the user enters commands recieves visual output
		while (true) {

			// Asking user for command
			System.out.println("ENTER ACTION");
			System.out.print(">> ");
			uCmd = sc.nextLine();
			// Converting command to lowercase for overriding case-sensitivity
			uCmd.toLowerCase();

			System.out.println();

			// Call function for executing the user's entered command
			execCmd();

		}
	}

	private void execCmd() {

		// Object for accessing the various commands
		GameCommands gCommands = new GameCommands();

		// getting words in uCmd using utils.getWords()
		String[] cmd = ut.getWords(uCmd);

		// Switc-case for command
		// Uses String based case
		// JDK > 8
		// Displays map with player location if player just moved
		int displaymg = 0;
		switch (cmd[0]) {

			case "move":
			case "mov":
			case "mv":
				displaymg = 1;
				int[] moveadd = gCommands.move(cmd[1]);
				mPlayer.movePlayer(moveadd[1], moveadd[0]);
				break;

			case "help":
			case "h":
				gCommands.displayHelp();
				break;

			case "quit":
			case "exit":
			case "e":
			case "q":
				sc.close();
				gCommands.quitGame();
				break;

			default:
				gCommands.displayErr();
				break;

		}

		if (displaymg == 1) {

			uic.displayMapGrid(mPlayer.playerLoc);
			System.out.println();
		}
	}
}
