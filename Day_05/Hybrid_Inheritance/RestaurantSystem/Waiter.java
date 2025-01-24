package RestaurantSystem;

public class Waiter extends Person implements Worker{
    private int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Waiter) is serving " + tablesAssigned + " tables.");
    }

    public void takeOrder() {
        System.out.println(name + " is taking customer orders.");
    }
}
