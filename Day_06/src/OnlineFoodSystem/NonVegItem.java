package OnlineFoodSystem;

public class NonVegItem extends FoodItem implements Discountable{
    private static final double NON_VEG_SURCHARGE = 50.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (price * quantity) + NON_VEG_SURCHARGE;
    }

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.85; // 15% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Non-veg items have a 15% discount.";
    }
}
