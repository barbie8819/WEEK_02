import java.util.Scanner;

public class MobilePhoneClass {
    public static void main(String[] args) {
        // Create a MobilePhone object with attributes
        MobilePhone mobilePhone = new MobilePhone("SD303" , "Laptop" , 100000);

        // Display MobilePhone details
        mobilePhone.display();
		
    }
}

class MobilePhone {
    private String brand;
    private String model;
    private int price;

    // Constructor
    public MobilePhone(String brand,String model,int price) {
        this.brand=brand;
		        this.model=model;
        this.price=price;

    }

  

    // Method to display the details
    public void display() {
        System.out.println(Brand name  : " + this.brand);
           System.out.println("model name : " + this.name);
        System.out.println("price of the phone : " + this.price);

   }
     
	   
	   
	   
	   

   
}
