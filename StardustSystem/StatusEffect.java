package StardustSystem;

/**
 * Status Effect class
 *
 * Status effects are implemented as skills that fire every round at the same target
 */
public class StatusEffect extends Skill {

    private int lifeTime;
    GameCharacter source;

    //Deletion is handled by the GameCharacter class
    public void activate(GameCharacter target){
        lifeTime--;
        GameCharacter targets[] = {target};
        super.activate(source, targets);
    }

    public boolean dead(){
        return lifeTime <= 0;
    }
}
