package JavaUdemyTrainning.Enums.OrderEnum;

import java.util.Date;

public class OrderStatusRun {

    public static void main(String[] args) {
        Order _order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(_order);
    }
}
