package RestaurantSystem;

public class RestaurantClass {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon Ramsay", 101, "Italian");
        Waiter waiter = new Waiter("John Doe", 202, 5);

        // Display information
        chef.displayInfo();
        chef.performDuties();
        chef.cook();

        System.out.println();

        waiter.displayInfo();
        waiter.performDuties();
        waiter.takeOrder();
    }
}
