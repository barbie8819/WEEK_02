import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Item to Cart");
            System.out.println("2. Remove Item from Cart");
            System.out.println("3. Display Total Cost");
            System.out.println("4. Display Cart Items");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter Item Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Item Quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addItem(new CartItem(itemName, price, quantity));
                    break;
                case 2:
                    System.out.print("Enter Item Name to Remove: ");
                    String removeName = scanner.nextLine();
                    cart.removeItem(removeName);
                    break;
                case 3:
                    System.out.println("Total Cost: $" + String.format("%.2f", cart.calculateTotalCost()));
                    break;
                case 4:
                    cart.displayCartItems();
                    break;
                case 5:
                    System.out.println("Exiting. Thank you for shopping!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Calculate total price for the item
    public double getTotalPrice() {
        return price * quantity;
    }

    // Display item details
    public void displayItem() {
        System.out.println(itemName + " - $" + price + " x " + quantity + " = $" + String.format("%.2f", getTotalPrice()));
    }
}

class ShoppingCart {
    private ArrayList<CartItem> items;

    // Constructor
    public ShoppingCart() {
        items = new ArrayList<>();
    }

    // Add an item to the cart
    public void addItem(CartItem item) {
        items.add(item);
        System.out.println("Added " + item.getItemName() + " to the cart.");
    }

    // Remove an item from the cart by name
    public void removeItem(String itemName) {
        for (CartItem item : items) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                items.remove(item);
                System.out.println("Removed " + itemName + " from the cart.");
                return;
            }
        }
        System.out.println("Item not found in the cart.");
    }

    // Calculate the total cost of the cart
    public double calculateTotalCost() {
        double totalCost = 0;
        for (CartItem item : items) {
            totalCost += item.getTotalPrice();
        }
        return totalCost;
    }

    // Display all items in the cart
    public void displayCartItems() {
        if (items.isEmpty()) {
            System.out.println("The cart is empty.");
            return;
        }
        System.out.println("Cart Items:");
        for (CartItem item : items) {
            item.displayItem();
        }
    }
}
