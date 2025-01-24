package SmartHomeDevice;

public class Thermostat extends Device{
    private double temperatureSetting;

    public Thermostat(int deviceId, boolean status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature :"+ temperatureSetting);
    }
}
