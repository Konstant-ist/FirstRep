package iprody.coffeeshot;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class CoffeeOrderBoard {
    private final List<Order> orders = new LinkedList<>();
    private int nextOrderNumber = 1; // Начинаем нумерацию с 1

    // Добавляет новый заказ с автоматическим номером
    public void add(String customerName) {
        Order newOrder = new Order(nextOrderNumber, customerName);
        orders.add(newOrder);
        nextOrderNumber++;
    }


    public Order deliver() {
        if (orders.isEmpty()) {
            throw new NoSuchElementException("Нет заказов в очереди");
        }
        return orders.remove(0);
    }

    
    public Order deliver(int orderNumber) {
        for (Order order : orders) {
            if (order.getNumber() == orderNumber) {
                orders.remove(order);
                return order;
            }
        }
        throw new NoSuchElementException("Заказ №" + orderNumber + " не найден");
    }

    // Выводит текущую очередь заказов
    public void draw() {
        System.out.println("=============");
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}