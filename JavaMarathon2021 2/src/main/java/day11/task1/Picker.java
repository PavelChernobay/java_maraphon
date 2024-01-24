package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    Warehouse warehouse;
    private int amountPicker;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
        isPayed = false;
        amountPicker++;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.countPickedOrders++;
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        if (amountPicker > 1) {
            if (warehouse.countPickedOrders >= (10000 / amountPicker)) {
                isPayed = true;
                salary += 50000;
                return;
            }
        }

        if (warehouse.countPickedOrders >= 10000) {
            isPayed = true;
            salary += 70000;
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
