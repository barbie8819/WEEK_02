package ECommercePlatform;

import java.util.List;

public class Main {

    public static void printFinalPrice(List<Product> products) {
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double priceAfterDiscount = product.getPrice() - discount;

            double tax = 0;
            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
            }

            double finalPrice = priceAfterDiscount + tax;
            System.out.println("Product: " + product.getName() +
                    ", Final Price: " + finalPrice);
        }
    }
    public static void main(String[] args) {
        Product electronics = new Electronics("1", "Laptop", 1000);
        Product clothing = new Clothing("2", "T-shirt", 50);
        Product groceries = new Groceries("3", "Apple", 2);

        List<Product> products = List.of(electronics, clothing, groceries);
        printFinalPrice(products);
    }
}

