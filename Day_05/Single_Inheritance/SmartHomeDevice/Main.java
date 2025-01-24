package SmartHomeDevice;

public class Main {
    public static void main(String[] args){
        Device device = new Device(101,false);
        device.displayStatus();
        Thermostat obj = new Thermostat(102,true,4);
        obj.displayStatus();
    }
}
