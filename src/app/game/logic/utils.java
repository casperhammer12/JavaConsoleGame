package app.game.logic;

public class utils {

	/**
	 * calcDigits() => function to calculate number of digits for a given number
	 * 
	 * @param num => Given integer
	 * @return => Number of Digits in num
	 */
	public int calcDigits(int num) {
		int digitNo = 0;

		while (num > 0) {
			digitNo++;
			num = num / 10;
		}

		return digitNo;
	}

	public String[] getWords(String s) {
		s.trim();
		s += " ";
		int wordsNo = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 32) {
				wordsNo++;
			}
		}

		String[] words = new String[wordsNo];

		int ind = 0;
		int prevInd = 0;
		s.trim();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 32) {
				System.out.println(s.substring(prevInd, i));
				words[ind] = s.substring(prevInd, i);
				prevInd = i + 1;
				ind++;
			}
		}
		// words[wordsNo - 1] = s.substring(prevInd, s.length() - 1);

		return words;
	}

	public void drawScoreLine(int num) {
		int len = calcDigits(num);

		System.out.println("+--------");
		for (int i = 0; i < len; i++) {
			System.out.print("-");
		}
		System.out.println("-+");
	}

	public void drawNameLine(String name) {
		int len = name.length();

		System.out.println("+-------");
		for (int i = 0; i < len; i++) {
			System.out.print("-");
		}
		System.out.println("-+");
	}
}
