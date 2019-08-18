package players;

import boss.Boss;

public class Magical extends Hero {
    public Magical(int hp, int damage) {
        super(hp, damage, Ability.BOOST_DAMAGE);
    }

    @Override
    public void useSuperPower(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
        heroes[i].setDamage(heroes[i].getDamage()+ 10);

        }
    }
}