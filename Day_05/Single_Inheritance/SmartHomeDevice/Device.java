package SmartHomeDevice;

public class Device {
    private int deviceId;
    private boolean status;

    public Device(int deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    public void displayStatus(){
        System.out.println("device id is :"+ deviceId);
        System.out.println("device status is :"+ status);

    }
}
