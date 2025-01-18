    // Main method to demonstrate
	public class PersonClass{
    public static void main(String[] args) {
	        System.out.println("Original:");

        Person original = new Person("Alice", 25);
		original.Display();
		        System.out.println("Copy: ");

        Person copy = new Person(original);
		copy.Display();
    }
}
public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    public void Display (){
	  System.out.println("Name of person : " + this.name);
      	  System.out.println("Age of person : " + this.age);

  }

}
