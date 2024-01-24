package day11.task2;

public abstract class Hero {
    private int health;
    private int physAtt;
    private int physDef;
    private int magicAtt;
    private int magicDef;
    private int healHimself;
    private int healTeammate;
    protected static final int MAX_HEALTH = 100;
    protected static final int MIN_HEALTH = 0;

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

    public int getMagicAtt() {
        return magicAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
    }

    public int getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(int magicDef) {
        this.magicDef = magicDef;
    }

    public int getHealHimself() {
        return healHimself;
    }

    public void setHealHimself(int healHimself) {
        this.healHimself = healHimself;
    }

    public int getHealTeammate() {
        return healTeammate;
    }

    public void setHealTeammate(int healTeammate) {
        this.healTeammate = healTeammate;
    }


}
