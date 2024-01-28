package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    private int healHimself;
    private int healTeammate;

    public Paladin() {
        super();
        setPhysAtt(15);
        setPhysDef(50);
        setMagicDef(20);
        healHimself = 25;
        healTeammate = 10;
    }

    @Override
    public void healHimself() {
        if (getHealth() == MAX_HEALTH) {
            return;
        }

        setHealth(getHealth() + healHimself);

        if (getHealth() > MAX_HEALTH) {
            setHealth(MAX_HEALTH);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() == MAX_HEALTH) {
            return;
        }

        hero.setHealth(hero.getHealth() + healTeammate);

        if (hero.getHealth() > MAX_HEALTH) {
            hero.setHealth(MAX_HEALTH);
        }
    }

    @Override
    public String toString() {
        return "Paladin{health=" + getHealth();
    }
}
