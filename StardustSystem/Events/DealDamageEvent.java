package StardustSystem.Events;

import StardustSystem.Event;
import StardustSystem.GameCharacter;

public class DealDamageEvent implements Event {

    public void resolve(GameCharacter user, GameCharacter[] targets){

        for(GameCharacter target : targets){
            int damage = 0;
            damage = user.getMight();
            target.incrementHealth(damage);
        }
    }
}
