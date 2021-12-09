package app.game.ui;

import app.game.MainPlayer;
import app.game.logic.GameLogic;

/**
 * UIText
 * 
 * Class containing large UI elements in an array
 */
public class UIText {

	public static String[] str = new String[5];

	public static void setText() {

	//@formatter:off
		
		str[0] = new StringBuilder()
			.append("+-------------------------------------------+\n")
			.append("|    ______                                 |\n")
			.append("|   /  ____|_________________________       |\n")
			.append("|   | /    /  ___  /        /   ____/       |\n")
			.append("|   | |   _| |__/ |  /  /  |  /____         |\n")
			.append("|   | \\__| |   _  |  |  |  |    __|         |\n")
			.append("|   \\______/__/ \\__\\__|__|_/  /_______      |\n")
			.append("|                           \\_________/     |\n")
			.append("|                                           |\n")
			.append("|                                           |\n")
			.append("|        ENTER NAME TO START...             |\n")
			.append("|                                           |\n")
			.append("+-------------------------------------------+\n")
		.toString();

		str[1] = new StringBuilder()
			.append("\n+-------------------------------------------------------+\n")
			.append("|                                                       |\n")
			.append("|    	COMMANDS:                                       |\n")
			.append("|                                                       |\n")
			.append("|          HELP - Displays this screen                  |\n")
			.append("|          MOVE - Moves main player in the              |\n")
			.append("|                 specified direction                   |\n")
			.append("|                                                       |\n")
			.append("|             USAGE: MOVE <dir>                         |\n")
			.append("|                 <dir> = up/north                      |\n")
			.append("|                         down/south                    |\n")
			.append("|                         left/west                     |\n")
			.append("|                         right/east                    |\n")
			.append("|                                                       |\n")
			.append("|          QUIT - Exit the game                         |\n")
			.append("|                                                       |\n")
			.append("+-------------------------------------------------------+\n")
		.toString();

		//@formatter:on
	}

	public static void getMapGrid(int[] loc) {

		// Wrapping player's movements
		if (loc[0] < 0)
			loc[0] = 9;
		else if (loc[0] > 9)
			loc[0] = 0;

		if (loc[1] < 0)
			loc[1] = 9;
		else if (loc[1] > 9)
			loc[1] = 0;

		StringBuilder s = new StringBuilder("\n");

		// Displaying top border for grid
		for (int y = 0; y < 23; y++) {
			if (y == 0 || y == 22) {
				s.append("+");
			} else {
				s.append("-");
			}
		}

		// Printing the grid
		for (int x = 0; x < 10; x++) {
			s.append("\n| ");
			for (int y = 0; y < 10; y++) {
				if (x == loc[0] && y == loc[1]) {
					s.append("# ");
				} else {
					s.append(". ");
				}
			}
			s.append("|");

		}
		s.append("\n");

		// Displaying top border for grid
		for (int y = 0; y < 23; y++) {
			if (y == 0 || y == 22) {
				s.append("+");
			} else {
				s.append("-");
			}
		}

		str[2] = s.toString();

	}

	public static void getQuitDisplay(MainPlayer mPlayer) {

		StringBuilder s = new StringBuilder("\n");
		int i = 0;


		System.out.print("\n+");
		int endVal = GameLogic.getDigits((int) (mPlayer.Displacement)) + 17;
		for (i = 0; i < endVal; i++) {
			System.out.print("-");
		}
		System.out.print("+\n");

		System.out.println("| DISPLACEMENT: " + (int) mPlayer.Displacement + " |");
		System.out.println("| DISTANCE: " + mPlayer.Distance + "\t  |");

		System.out.print("+");
		for (i = 0; i < endVal; i++) {
			System.out.print("-");
		}
		System.out.print("+\n");


		s.append("+");
		i = 0;
		while (i < 21) {
			i++;
			s.append("-");
		}
		s.append("+\n");

		s.append("| THANKS FOR PLAYING! |\n");

		s.append("+");
		i = 0;
		while (i < 21) {
			i++;
			s.append("-");
		}
		s.append("+\n");

		str[3] = s.toString();

	}


}
