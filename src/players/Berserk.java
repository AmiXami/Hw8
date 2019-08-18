package players;

import boss.Boss;


import java.util.Random;

public class Berserk extends Hero {
    public Berserk(int hp, int damage) {
        super(hp, damage,Ability.CRITICAL_DAMAGE);
    }
    Random random = new Random();
    int randomCriticaly =random.nextInt(4) + 2;

    @Override
    public void useSuperPower(Hero[] heroes , Boss boss) {
        heroes[3].setDamage(heroes[3].getDamage() * randomCriticaly);



    }
}




