package DesignPatterns.Facade_Design_Patterns;

public class Order {

    private String orderNumber;

    public Order(String orderNumber){

        this.orderNumber = orderNumber;

    }

    public String getOrderNumber() {
        return orderNumber;
    }
}
