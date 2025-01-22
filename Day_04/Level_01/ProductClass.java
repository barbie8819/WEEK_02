import java.util.ArrayList;
import java.util.List;

public class ProductClass {
    public static void main(String[] args) {
        // Create Products
        Product product1 = new Product("Laptop", 899.99);
        Product product2 = new Product("Smartphone", 499.99);
        Product product3 = new Product("Headphones", 89.99);

        // Create Customers
        Customer customer1 = new Customer("Sumit", "alice@example.com");
        Customer customer2 = new Customer("Kumar", "bob@example.com");

        // Create Orders and add Products
        Order order1 = new Order(customer1);
        order1.addProduct(product1);
        order1.addProduct(product2);
        
        Order order2 = new Order(customer2);
        order2.addProduct(product2);
        order2.addProduct(product3);

        // Place Orders
        customer1.placeOrder(order1);
        customer2.placeOrder(order2);

        // Display Order Details
        System.out.println("\nOrder Details for " + customer1.getName() + ":");
        order1.displayOrderDetails();

        System.out.println("\nOrder Details for " + customer2.getName() + ":");
        order2.displayOrderDetails();
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

class Order {
    private int orderId;
    private Customer customer;
    private List<Product> products;
    private static int orderCounter = 1;

    public Order(Customer customer) {
        this.orderId = orderCounter++;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public int getOrderId() {
        return orderId;
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("- " + product);
        }
        System.out.println("Total: $" + calculateTotal());
    }
}

class Customer {
    private String name;
    private String email;
    private List<Order> orders;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed an order (Order ID: " + order.getOrderId() + ").");
    }

    public List<Order> getOrders() {
        return orders;
    }
}