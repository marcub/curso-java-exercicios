package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy");
    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> orderItemList = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Order() {
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void addItem(OrderItem item) {
        orderItemList.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItemList.remove(item);
    }

    public double total() {
        double sum = 0;
        for (OrderItem x : orderItemList) {
            sum += x.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Order moment: ");
        output.append(format1.format(moment));
        output.append("\n");
        output.append("Order Status: ");
        output.append(status);
        output.append("\n");
        output.append("Client: ");
        output.append(client.getName());
        output.append(" (" + format2.format(client.getBirthDate()) + ") - " + client.getEmail());
        output.append("\n");
        output.append("Order items: \n");
        for (OrderItem x : orderItemList) {
            output.append(x + "\n");
        }
        output.append("Total price: $");
        output.append(String.format("%.2f", total()));
        return output.toString();
    }
}
