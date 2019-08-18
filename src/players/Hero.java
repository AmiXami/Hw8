package players;

import game.GameEntity;

public abstract class Hero extends GameEntity implements SuperPowerApplicable {
    private Ability ability;

    public Ability getAbility() {
        return ability;
    }

    public Hero(int hp, int damage, Ability ability) {
        super(hp, damage);
        this.ability = ability;
    }
}
