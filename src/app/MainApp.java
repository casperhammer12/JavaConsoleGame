package app;

import app.game.logic.GameLoop;

/**
 * MainApp
 */
public class MainApp {

    public static void main(String[] args) throws Exception {

        GameLoop gLoop = new GameLoop();

        gLoop.mainLoop();

    }

}