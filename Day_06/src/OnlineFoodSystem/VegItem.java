package OnlineFoodSystem;

public class VegItem extends FoodItem implements Discountable{
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return price * quantity;
    }

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.90; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Veg items have a 10% discount.";
    }
}
