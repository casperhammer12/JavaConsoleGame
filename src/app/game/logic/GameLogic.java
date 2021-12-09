package app.game.logic;

import app.game.MainPlayer;

public class GameLogic {

	/**
	 * calcDigits() => function to calculate number of digits for a given number
	 * 
	 * @param num Given integer
	 * @return Number of Digits in num
	 */
	public static int getDigits(int num) {

		int digitNo = 0;

		while (num > 0) {
			digitNo++;
			num = num / 10;
		}

		return digitNo;
	}

	/**
	 * getWords() => function to return an array of words from a given String
	 * 
	 * @param s Given string
	 * @return Array containing all words from the string
	 */
	public static String[] getWords(String s) {

		// Setting up input String
		// Cutting off trailing and leading whitespaces
		// Adding a triling whitespace
		s.trim();
		s += " ";

		// Getting number of words in 's'
		int wordsNo = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 32) {
				wordsNo++;
			}
		}

		// Array for holding all the words
		String[] words = new String[wordsNo];

		// Getting all words from array and inserting them into array 'words'
		s.trim();
		int index = 0;
		int prevIndex = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == 32) || (i == s.length() - 1)) {
				words[index] = s.substring(prevIndex, i);
				prevIndex = i + 1;
				index++;
			}
		}

		return words;
	}

	public static void setDisplacement(MainPlayer mPlayer) {

		double displacement;

		displacement = Math.sqrt(Math.pow((4 - mPlayer.FinalLocation[0]), 2)
				+ Math.pow((4 - mPlayer.FinalLocation[1]), 2)) + 1;

		mPlayer.getDisplacement(displacement);

	}

}
