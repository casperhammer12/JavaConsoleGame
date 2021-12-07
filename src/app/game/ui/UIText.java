package app.game.ui;

public class UIText {

	public String[] str = new String[5];

	public UIText() {
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

}
