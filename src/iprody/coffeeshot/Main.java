package iprody.coffeeshot;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        board.add("Alen");
        board.add("Yoda");
        board.add("Obi-van");
        board.add("djedai");
        board.add("sidh");

        board.draw();

        Order nextOrder = board.deliver();
        System.out.println("\nВыдан заказ: " + nextOrder);


        board.draw();


        Order specificOrder = board.deliver(3);
        System.out.println("\nВыдан заказ: " + specificOrder);

        board.draw();
    }
}
