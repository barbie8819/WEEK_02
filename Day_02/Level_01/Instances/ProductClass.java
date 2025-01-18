public class ProductClass{
    // Main method for testing
    public static void main(String[] args) {
        // Creating product objects
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 599.49);
        Product product3 = new Product("Tablet", 299.99);

        // Displaying product details
        product1.displayProductDetails();
        System.out.println();

        product2.displayProductDetails();
        System.out.println();

        product3.displayProductDetails();
        System.out.println();

        // Displaying total products created
        Product.displayTotalProducts();
    }
}
 class Product {
    // Instance variables
    private String productName;
    private double price;

    // Class variable (shared among all instances)
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment the totalProducts count whenever a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method to display the total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

}
