package StardustSystem;
import java.util.List;

/**
 * GameCharacter class to represent all player characters and enemies
 * Both players and enemies share same stats and mechanics
 */
public class GameCharacter {

    //Character Fluff
    private String name;

    //Base stats
    private int baseHealth;
    private int baseMight;
    private int baseProtection;
    private int baseResistance;
    private int baseAccuracy;
    private int baseDodge;
    private int baseCrit;

    //In battle state
    private int health;
    private int might;
    private int protection;
    private int resistance;
    private int accuracy;
    private int dodge;
    private int crit;

    //Other stats
    private Skill[] skills;
    private List<StatusEffect> statusEffects;



    public GameCharacter(){
        baseHealth = 0;
        baseMight = 0;
        baseProtection = 0;
        baseResistance = 0;
        baseAccuracy = 0;
        baseDodge = 0;
        baseCrit = 0;
    }


    /**
     * Initializes the character stats at the start of a battle
     * Gives stats after all equipment effects
     */
    public void initialize(){
        health = baseHealth;
        might = baseMight;
        protection = baseProtection;
        resistance = baseResistance;
        accuracy = baseAccuracy;
        dodge = baseDodge;
        crit = baseCrit;
    }

    /**
     * Called to update the character status at the end of every round
     * Recalculates modifiers on might, prot, etc. as well as resolves status effects
     */
    public void updateStatus(){
        statusEffects.removeIf(StatusEffect::dead);
       //statusEffects.removeIf((StatusEffect currEffect) -> currEffect.dead());
    }
    //Unfinished


    /**
     * Increment functions: for changing character stats during a battle or event
     * only modifies current stat value
     *
     * If you are trying to do anything other than a permanent buff or debuff, I recommend making use of the StatusEffect
     * class instead of using these functions
     */
    public void incrementHealth(int delta){
        health += delta;
    }

    public void incrementMight(int delta){
        might += delta;
    }

    public void incrementProtection(int delta){
        protection += delta;
    }

    public void incrementResistance(int delta){
        resistance += delta;
    }

    public void incrementAccuracy(int delta){
        accuracy += delta;
    }

    public void incrementDodge(int delta){
        dodge += delta;
    }

    public void incrementCrit(int delta){
        crit += delta;
    }

    /**
     * Getters/Setters
     */
    public int getMight(){
        return might;
    }

}
