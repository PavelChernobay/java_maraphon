package day11.task2;

public class Magician extends Hero implements MagicalAttack, PhysAttack {
    public Magician() {
        super();
        setHealth(MAX_HEALTH);
        setPhysAtt(5);
        setMagicAtt(20);
        setMagicDef(80);
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.getHealth() == MIN_HEALTH) {
            return;
        }

        hero.setHealth(hero.getHealth() - (getMagicAtt() - (getMagicAtt() * hero.getMagicDef() / 100)));

        if (hero.getHealth() < MIN_HEALTH) {
            hero.setHealth(MIN_HEALTH);
        }
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.getHealth() == MIN_HEALTH) {
            return;
        }

        hero.setHealth(hero.getHealth() - (getPhysAtt() - (getPhysAtt() * hero.getPhysDef() / 100)));

        if (hero.getHealth() < MIN_HEALTH) {
            hero.setHealth(MIN_HEALTH);
        }
    }

    @Override
    public String toString() {
        return "Magician{health=" + getHealth();
    }
}
