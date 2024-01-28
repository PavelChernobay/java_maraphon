package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicalAttack, Healer {
    private int magicAtt;
    private int healHimself;
    private int healTeammate;

    public Shaman() {
        super();
        setPhysAtt(10);
        magicAtt = 15;
        setPhysDef(20);
        setMagicDef(20);
        healHimself = 50;
        healTeammate = 30;
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
    public void magicalAttack(Hero hero) {
        if (hero.getHealth() == MIN_HEALTH) {
            return;
        }

        hero.setHealth(hero.getHealth() - (magicAtt - (magicAtt * hero.getMagicDef() / MAX_HEALTH)));

        if (hero.getHealth() < MIN_HEALTH) {
            hero.setHealth(MIN_HEALTH);
        }
    }

    @Override
    public String toString() {
        return "Shaman{health=" + getHealth();
    }
}
