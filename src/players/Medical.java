package players;

import boss.Boss;

public class Medical extends Hero {
    public Medical(int hp, int damage) {
        super(hp, damage,Ability.HEAL);
    }

    @Override
    public void useSuperPower(Hero[] heroes, Boss boss) {
        for (int i = 0; i <heroes.length ; i++) {
            heroes[i].setHp(heroes[i].getHp() + 10);

        }
    }
}
