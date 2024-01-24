package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicalAttack, Healer {
    public Shaman() {
        super();
        setHealth(MAX_HEALTH);
        setPhysAtt(10);
        setMagicAtt(15);
        setPhysDef(20);
        setMagicDef(20);
        setHealHimself(50);
        setHealTeammate(30);
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
    public void magicalAttack(Hero hero) {
        if (hero.getHealth() == MIN_HEALTH) {
            return;
        }

        hero.setHealth(hero.getHealth() - (getMagicAtt() - (getMagicAtt() * hero.getMagicDef() / MAX_HEALTH)));

        if (hero.getHealth() < MIN_HEALTH) {
            hero.setHealth(MIN_HEALTH);
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
        return "Shaman{health=" + getHealth();
    }
}
