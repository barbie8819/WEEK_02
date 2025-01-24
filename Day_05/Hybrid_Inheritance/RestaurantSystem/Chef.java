package RestaurantSystem;

public class Chef extends Person implements Worker{
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Chef) is preparing " + specialty + " dishes.");
    }

    public void cook() {
        System.out.println(name + " is cooking delicious meals.");
    }
}
