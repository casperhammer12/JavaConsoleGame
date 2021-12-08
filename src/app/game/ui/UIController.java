package app.game.ui;

/**
 * UIController
 * 
 * A class for managing UI for the game
 */
public class UIController {

	/**
	 * displayUI() => Function for displaying UI from an external class
	 * 
	 * @param index index at which UI text is at
	 */
	public void displayUI(int index) {

		UIText uts = new UIText();
		System.out.println(uts.str[index]);
	}


	/**
	 * displayMapGrid() => Function for displaying the player in a 10x10 grid
	 * 
	 * @param loc location of the player in the form [x,y]
	 */
	public void displayMapGrid(int[] loc) {

		// Wrapping player's movements
		if (loc[0] < 0)
			loc[0] = 9;
		else if (loc[0] > 9)
			loc[0] = 0;

		if (loc[1] < 0)
			loc[1] = 9;
		else if (loc[1] > 9)
			loc[1] = 0;

		// Displaying top border for grid
		for (int y = 0; y < 23; y++) {
			if (y == 0 || y == 22) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}
		}
		System.out.println();

		// Printing the grid
		for (int x = 0; x < 10; x++) {
			System.out.print("| ");
			for (int y = 0; y < 10; y++) {
				if (x == loc[0] && y == loc[1]) {
					System.out.print("# ");
				} else {
					System.out.print(". ");
				}
			}
			System.out.println("|");

		}

		// Displaying top border for grid
		for (int y = 0; y < 23; y++) {
			if (y == 0 || y == 22) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}
		}

	}
}
