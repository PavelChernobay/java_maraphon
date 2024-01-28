package day11.task2;

public class Magician extends Hero implements MagicalAttack, PhysAttack {
    private int magicAtt;

    public Magician() {
        super();
        setPhysAtt(5);
        this.magicAtt = 20;
        setMagicDef(80);
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.getHealth() == MIN_HEALTH) {
            return;
        }

        hero.setHealth(hero.getHealth() - (magicAtt - (magicAtt * hero.getMagicDef() / 100)));

        if (hero.getHealth() < MIN_HEALTH) {
            hero.setHealth(MIN_HEALTH);
        }
    }

    @Override
    public String toString() {
        return "Magician{health=" + getHealth();
    }
}
