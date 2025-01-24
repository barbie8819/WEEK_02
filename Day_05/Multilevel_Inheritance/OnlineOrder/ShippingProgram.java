package OnlineOrder;

public class ShippingProgram {
    // Main class to demonstrate functionality

        public static void main(String[] args) {
            DeliveredOrder order = new DeliveredOrder("ORD123", "2023-01-15", "TRK456", "2023-01-20");
            System.out.println(order.getOrderStatus());
        }
    }

