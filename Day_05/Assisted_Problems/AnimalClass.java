// Main class to demonstrate functionality
public class AnimalHierarchy{
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3);
        Animal myCat = new Cat("Whiskers", 2);
        Animal myBird = new Bird("Tweety", 1);

        myDog.makeSound();
        myCat.makeSound();
        myBird.makeSound();
    }
}

// Superclass Animal
class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

 
    public void makeSound() {
        System.out.println(name + " barks");
    }
}

// Subclass Cat
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    
    public void makeSound() {
        System.out.println(name + " meows");
    }
}

// Subclass Bird
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " chirps");
    }
}

