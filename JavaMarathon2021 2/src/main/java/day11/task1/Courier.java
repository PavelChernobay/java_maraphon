package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private int amountCourier;
    Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
        isPayed = false;
        amountCourier++;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.countDeliveredOrders++;
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        if (amountCourier > 1) {
            if (warehouse.countPickedOrders >= (10000 / amountCourier)) {
                isPayed = true;
                salary += 50000;
                return;
            }
        }

        if (warehouse.countDeliveredOrders >= 10000) {
            isPayed = true;
            salary += 50000;
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }

    @Override
    public String toString() {
        return "заработная плата: " + getSalary() +
                ", выплачен бонус: " + isPayed();
    }
}
