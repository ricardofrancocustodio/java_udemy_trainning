package JavaUdemyTrainning.Enums.OrderEnum;

import java.util.Date;

public class Order {

    private Integer _id;
    private Date _moment;
    private OrderStatus _orderStatus;

    public Order(){}

    public Order(Integer _id, Date _moment, OrderStatus _orderStatus){
        this._id = _id;
        this._moment = _moment;
        this._orderStatus = _orderStatus;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public Date get_moment() {
        return _moment;
    }

    public void set_moment(Date _moment) {
        this._moment = _moment;
    }

    public OrderStatus get_orderStatus() {
        return _orderStatus;
    }

    public void set_orderStatus(OrderStatus _orderStatus) {
        this._orderStatus = _orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "_id=" + _id +
                ", _moment=" + _moment +
                ", _orderStatus=" + _orderStatus +
                '}';
    }
}
