package StardustSystem;

/**
 * Handles most of the setup for fights
 *
 * Will possibly be changed from a singleton in the future if I decide to implement
 * save states and turn undo functionality
 */
public class GameStateHandler {

    private GameCharacter[] playerParty;
    private GameCharacter[] enemyParty;



    private static GameStateHandler ourInstance = new GameStateHandler();

    public static GameStateHandler getInstance() {
        return ourInstance;
    }

    private GameStateHandler() {
    }
}
