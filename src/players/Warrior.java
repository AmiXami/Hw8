package players;

import boss.Boss;

public class Warrior extends Hero {
    public Warrior(int hp, int damage) {
        super(hp, damage,Ability.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void useSuperPower(Hero[] heroes, Boss boss) {
        heroes[0].setDamage(heroes[0].getDamage() +boss.getDamage()); {

        }
    }
}
