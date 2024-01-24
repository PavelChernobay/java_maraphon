package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    public Paladin() {
        super();
        setHealth(MAX_HEALTH);
        setPhysAtt(15);
        setPhysDef(50);
        setMagicDef(20);
        setHealHimself(25);
        setHealTeammate(10);
    }

    @Override
    public void healHimself() {
        if (getHealth() == MAX_HEALTH) {
            return;
        }

        setHealth(getHealth() + getHealHimself());

        if (getHealth() > MAX_HEALTH) {
            setHealth(MAX_HEALTH);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() == MAX_HEALTH) {
            return;
        }

        hero.setHealth(hero.getHealth() + getHealTeammate());

        if (hero.getHealth() > MAX_HEALTH) {
            hero.setHealth(MAX_HEALTH);
        }
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
        return "Paladin{health=" + getHealth();
    }
}
