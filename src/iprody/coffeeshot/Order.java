package iprody.coffeeshot;

public class Order {
    private final int number;
    private final String customerName;

    public Order(int number, String customerName) {
        this.number = number;
        this.customerName = customerName;
    }

    public int getNumber() {
        return number;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return number + " | " + customerName;
    }
}

