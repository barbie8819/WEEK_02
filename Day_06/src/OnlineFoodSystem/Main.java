package OnlineFoodSystem;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        FoodItem vegBurger = new VegItem("Veg Burger", 150.0, 2);
        FoodItem chickenPizza = new NonVegItem("Chicken Pizza", 300.0, 1);

        order.addItem(vegBurger);
        order.addItem(chickenPizza);

        order.printOrderDetails();
    }
}
