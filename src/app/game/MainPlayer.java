package app.game;

/**
 * MainPlayer
 * 
 * Class symbolizing the main player
 * 
 * @param playerName name of player
 * @param playerScore name of player
 * @param playerLoc location of player in [x,y]
 * @param playerId Player ID(UNIMPLEMENTED)
 */
public class MainPlayer {

	public String playerName;
	public int playerScore;
	public int[] playerLoc = new int[2];
	long playerId;

	public MainPlayer(String name) {
		playerName = name;
		playerId = 0;
		playerLoc[0] = 5;
		playerLoc[1] = 5;
	}

	// UNIMPLEMENTED
	public void scoreOps(int fac) {
		try {
			this.playerScore += fac;
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	// Function for moving the player
	public void movePlayer(int moveX, int moveY) {
		this.playerLoc[0] += moveX;
		this.playerLoc[1] += moveY;
	}
}
