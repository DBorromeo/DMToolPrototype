package StardustSystem;

/**
 * Interface for events
 *
 * Events are single changes to characters that when applied in sequence make up the elements of a Skill
 * Also used for Status Effects
 */
public interface Event {

    public void resolve(GameCharacter user, GameCharacter[] targets);

}
