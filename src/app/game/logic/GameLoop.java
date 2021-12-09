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
	GameLogic ut = new GameLogic();
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
		callCmd();

		// System.out.println(mPlayer.playerName);

		// Command Loop
		// Here the user enters commands recieves visual output
		while (true) {

			// Asking user for command
			System.out.println("ENTER ACTION");
			System.out.print(">> ");
			uCmd = sc.nextLine();
			System.out.println();

			// Converting command to lowercase for overriding case-sensitivity
			uCmd.toLowerCase();

			// Call function for executing the user's entered command
			callCmd();

		}
	}

	private void callCmd() {

		// Object for accessing the various commands
		GameCommands gCommands = new GameCommands();

		gCommands.setCmd(uCmd);
		int closeFlag = gCommands.execCmd(mPlayer);

		if (closeFlag == 1) {
			sc.close();
			System.exit(0);
		}

	}
}
