package app.game.ui;

public class UIController {
	public void displayUI(int index) {
		UIText uts = new UIText();
		System.out.println(uts.str[index]);
	}

	public void displayMapGrid(int[] loc) {

		if (loc[0] < 0)
			loc[0] = 9;
		else if (loc[0] > 9)
			loc[0] = 0;

		if (loc[1] < 0)
			loc[1] = 9;
		else if (loc[1] > 9)
			loc[1] = 0;

		for (int y = 0; y < 23; y++) {
			if (y == 0 || y == 22) {
				System.out.print("+");
			}
			else {
				System.out.print("-");
			}
		}
		System.out.println();

		for (int x = 0; x < 10; x++) {
			System.out.print("| ");
			for (int y = 0; y < 10; y++) {
				if (x == loc[0] && y == loc[1]) {
					System.out.print("# ");
				}
				else {
					System.out.print(". ");
				}
			}
			System.out.println("|");

		}

		for (int y = 0; y < 23; y++) {
			if (y == 0 || y == 22) {
				System.out.print("+");
			}
			else {
				System.out.print("-");
			}
		}

	}
}
