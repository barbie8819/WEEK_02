package OnlineFoodSystem;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<FoodItem> foodItems = new ArrayList<>();

    public void addItem(FoodItem item) {
        foodItems.add(item);
    }

    public double calculateOrderTotal() {
        double total = 0;
        for (FoodItem item : foodItems) {
            if (item instanceof Discountable) {
                total =total + ((Discountable) item).applyDiscount(item.calculateTotalPrice());
            } else {
                total += item.calculateTotalPrice();
            }
        }
        return total;
    }

    public void printOrderDetails() {
        for (FoodItem item : foodItems) {
            System.out.println(item.getItemDetails());
            if (item instanceof Discountable) {
                System.out.println(((Discountable) item).getDiscountDetails());
            }
        }
        System.out.println("Total Order Cost: " + calculateOrderTotal());
    }

}
