package day11.task1;

public class Warehouse {
    protected int countPickedOrders;
    protected int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "количество собранных заказов - " + countPickedOrders +
                ", количество доставленных заказов - " + countDeliveredOrders;
    }
}
