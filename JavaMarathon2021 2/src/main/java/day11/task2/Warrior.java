package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    public Warrior() {
        super();
        setHealth(MAX_HEALTH);
        setPhysAtt(30);
        setPhysDef(80);
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.getHealth() == MIN_HEALTH) {
            return;
        }

        hero.setHealth(hero.getHealth() - (getPhysAtt() - (getPhysAtt() * hero.getPhysDef() / MAX_HEALTH)));

        if (hero.getHealth() < MIN_HEALTH) {
            hero.setHealth(MIN_HEALTH);
        }
    }

    @Override
    public String toString() {
        return "Warrior{health=" + getHealth();
    }
}
