import java.util.Scanner;

public class ItemClass {
    public static void main(String[] args) {
        // Create an Item object with attributes
        Item item = new Item("SD303" , "Laptop" , 100000);

        // Display item details
        item.display();
		int quantity =3;
		int totalCost = item.TotalCost(quantity);
		System.out.println("Total Cost : " + totalCost);
    }
}

class Item {
    private String itemCode;
    private String itemName;
    private int price;

    // Constructor
    public Item(String itemCode,String itemName,int price) {
        this.itemCode=itemCode;
		        this.itemName=itemName;
        this.price=price;

    }

  

    // Method to display the details
    public void display() {
        System.out.println("ItemCode  : " + this.itemCode);
           System.out.println("ItemName : " + this.itemName);
        System.out.println("price of the Item : " + this.price);

   }
   public int TotalCost(int quantity){
	   return quantity* this.price;
	   
   }
 
	   
	   
	   
	   
	   
	   

   
}
