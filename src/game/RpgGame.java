package game;

import boss.Boss;
import players.*;

public class RpgGame{
        public static void startGame() {
    Boss boss = new Boss(2500, 30);
    Hero[] heroes = getHeroesArray();
    while (!isFinished(heroes, boss)) {
        round(heroes, boss);
    }
}

        private static void round(Hero[] heroes, Boss boss) {
            bossHit(heroes, boss);
            heroesHit(heroes, boss);
            showStatistics(heroes, boss);
            heroesApplySuperPower(heroes,boss);
        }

        private static boolean isFinished(Hero[] heroes, Boss boss) {
            if (boss.getHp() <= 0) {
                System.out.println("Heroes won!!!");
                return true;
            }
            boolean allHeroesDied = true;
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHp() > 0) {
                    allHeroesDied = false;
                    break;
                }
            }
            if (allHeroesDied) {
                System.out.println("Boss won!!!");
            }
            return allHeroesDied;
        }

        private static Hero[] getHeroesArray() {
            Warrior warrior = new Warrior(200, 10);
            Medical medical = new Medical(150, 0);
            Magical magical = new Magical(150, 10);
            Berserk berserk = new Berserk(200, 20);

            Hero[] heroes = new Hero[4];
            heroes[0] = warrior;
            heroes[1] = medical;
            heroes[2] = magical;
            heroes[3] = berserk;
            return heroes;
        }

        private static void bossHit(Hero[] heroes, Boss boss) {
            for (int i = 0; i < heroes.length; i++) {
                heroes[i].setHp(heroes[i].getHp() - boss.getDamage());
            }
        }
    private static void heroesApplySuperPower(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].useSuperPower(heroes,boss);
            }
        }







        private static void heroesHit(Hero[] heroes, Boss boss) {
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHp() > 0) {
                    boss.setHp(boss.getHp() - heroes[i].getDamage());
                }
            }
        }

        private static void showStatistics(Hero[] heroes, Boss boss) {
            System.out.println("_____________");
            System.out.println("Boss health - " + boss.getHp());
            for (int i = 0; i < heroes.length; i++) {
                System.out.println("Hero "
                        + heroes[i].getClass().getSimpleName() +
                        " - " + heroes[i].getHp());
            }
            System.out.println("_____________");
        }

}


