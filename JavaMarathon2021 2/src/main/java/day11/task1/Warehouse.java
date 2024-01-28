package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void incrementCountDeliveryOrders() {
        countDeliveredOrders++;
    }

    public void incrementCountPickedOrders() {
        countPickedOrders++;
    }

    @Override
    public String toString() {
        return "количество собранных заказов - " + countPickedOrders +
                ", количество доставленных заказов - " + countDeliveredOrders;
    }
}
