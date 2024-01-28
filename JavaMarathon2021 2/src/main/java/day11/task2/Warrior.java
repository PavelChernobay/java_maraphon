package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    public Warrior() {
        super();
        setPhysAtt(30);
        setPhysDef(80);
    }

    @Override
    public String toString() {
        return "Warrior{health=" + getHealth();
    }
}
