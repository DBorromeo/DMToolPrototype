package StardustSystem;

enum Target {
    FRONTLINE,
    BACKLINE,
    ALL
}

/**
 * Skill class to represent character skills
 * Will also be used for normal actions like basic attacks
 *
 * Composed of single changes to characters applied in sequence to make up the full effect of a skill
 */
public class Skill {

    private int name;
    private Event[] events;
    private Target targetType;
    private boolean areaSkill;

    public void activate(GameCharacter user, GameCharacter[] targets){

        for(Event event : events){
            event.resolve(user, targets);
        }

    }
}
