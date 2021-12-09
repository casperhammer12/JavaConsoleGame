package app.game.ui;

import app.game.MainPlayer;

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

		UIText.setText();

		System.out.println(UIText.str[index]);

	}


	/**
	 * displayMapGrid() => Function for displaying the player in a 10x10 grid
	 * 
	 * @param loc location of the player in the form [x,y]
	 */
	public void displayMapGrid(int[] loc) {

		UIText.getMapGrid(loc);
		System.out.println(UIText.str[2]);

	}


	public void displayQuit(MainPlayer mPlayer) {

		UIText.getQuitDisplay(mPlayer);
		System.out.println(UIText.str[3]);

	}
}
