public class Product {
    private static double discount = 0.0; // Static variable shared by all products
    private final int productID; // Final variable for unique identifier
    private String productName;
    private double price;
    private int quantity;
    private static int idCounter = 1; // To generate unique IDs

    // Constructor
    public Product(String productName, double price, int quantity) {
        this.productID = idCounter++; // Assign a unique ID
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }

    // Check if object is an instance of Product
    public static boolean isProduct(Object obj) {
        return obj instanceof Product;
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1000, 2);
        Product p2 = new Product("Phone", 500, 5);

        // Update discount
        Product.updateDiscount(10);

        // Display details
        if (Product.isProduct(p1)) {
            p1.displayDetails();
        }
        if (Product.isProduct(p2)) {
            p2.displayDetails();
        }
    }
}