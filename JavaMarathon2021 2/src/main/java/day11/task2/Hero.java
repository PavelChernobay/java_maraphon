package day11.task2;

public abstract class Hero implements PhysAttack {
    private int health;
    private int physAtt;
    private int physDef;
    private int magicDef;
    protected static final int MAX_HEALTH = 100;
    protected static final int MIN_HEALTH = 0;

    public Hero() {
        health = MAX_HEALTH;
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.health == MIN_HEALTH) {
            return;
        }

        int attack = (physAtt - (physAtt * hero.physDef / MAX_HEALTH));
        hero.health =  hero.health - attack > 0 ? hero.health - attack : MIN_HEALTH;

        hero.setHealth(hero.health);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public int getPhysDef() {
        return physDef;
    }

    public void setPhysDef(int physDef) {
        this.physDef = physDef;
    }

    public int getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(int magicDef) {
        this.magicDef = magicDef;
    }
}
