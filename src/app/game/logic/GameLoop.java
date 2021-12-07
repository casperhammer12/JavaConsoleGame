package app.game.logic;

import java.util.Scanner;

import app.game.MainPlayer;
import app.game.ui.UIController;

public class GameLoop {

	MainPlayer mPlayer;
	String uCmd = "";
	UIController uic = new UIController();
	utils ut = new utils();
	Scanner sc = new Scanner(System.in);

	public void mainLoop() {
		String pName;

		uic.displayUI(0);

		System.out.print("Enter Name >> ");
		pName = sc.nextLine();

		mPlayer = new MainPlayer(pName);
		System.out.println(mPlayer.playerName);

		while (true) {

			System.out.println("Enter ACTION");
			System.out.print(">> ");
			uCmd = sc.nextLine();
			uCmd.toLowerCase();

			System.out.println();

			execCmd();

		}
	}

	private void execCmd() {

		GameCommands gCommands = new GameCommands();

		String[] cmd = ut.getWords(uCmd);
		int displaymg = 1;
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
				displaymg = 0;
				gCommands.displayHelp();
				break;

			case "quit":
			case "q":
				displaymg = 0;
				sc.close();
				gCommands.quitGame();
				break;

			default:
				displaymg = 0;
				gCommands.displayErr();
				break;

		}
		if (displaymg == 1) {
			uic.displayMapGrid(mPlayer.playerLoc);
			System.out.println();
		}
	}
}
