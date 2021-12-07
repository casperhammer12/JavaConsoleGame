package app.game;

public class MainPlayer {

	public String playerName;
	public int playerScore;
	public int[] playerLoc = new int[2];
	long playerId;

	public MainPlayer(String name) {
		playerName = name;
		playerId = 0;
		playerLoc[0] = 0;
		playerLoc[1] = 0;
	}

	public void scoreOps(int fac) {
		try {
			this.playerScore += fac;
		}
		catch (Exception e) {
			System.err.println(e);
		}
	}

	public void movePlayer(int moveX, int moveY) {
		this.playerLoc[0] += moveX;
		this.playerLoc[1] += moveY;
	}
}
