package app.game;

/**
 * MainPlayer
 * 
 * Class symbolizing the main player
 * 
 * @param Name name of player
 * @param Distance distance moved by player
 * @param Displacement displacement of player
 * @param Location location of player in [x,y]
 * @param FinalLocation end location of player in [x,y]
 */
public class MainPlayer {

	public String Name;
	public int Distance;
	public double Displacement;
	public int[] Location;
	public int[] FinalLocation;

	public MainPlayer(String name) {

		Name = name;

		Displacement = 0;
		Distance = 0;

		Location = new int[] {5, 5};
		FinalLocation = new int[] {5, 5};

	}

	// Function for moving the player
	public void movePlayer(int moveX, int moveY) {

		this.Location[0] += moveX;
		this.Location[1] += moveY;

		this.FinalLocation[0] += moveX;
		this.FinalLocation[1] += moveY;

		this.Distance += 1;

	}

	/**
	 * @param displacement the displacement to set
	 */
	public void getDisplacement(double displacement) {

		Displacement = displacement;

	}
}
