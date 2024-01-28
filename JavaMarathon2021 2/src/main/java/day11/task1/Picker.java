package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;
    private static final int BONUS = 70000;
    private static final int SALARY_COURIER = 80;
    private static final int COUNT_DELIVERY_BONUS = 10000;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary += SALARY_COURIER;
        warehouse.incrementCountPickedOrders();
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        if (warehouse.getCountPickedOrders() >= COUNT_DELIVERY_BONUS) {
            isPayed = true;
            salary += BONUS;
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }

    @Override
    public String toString() {
        return "Заработная плата: " + getSalary() +
                "\nВыплачен бонус: " + isPayed();
    }
}
