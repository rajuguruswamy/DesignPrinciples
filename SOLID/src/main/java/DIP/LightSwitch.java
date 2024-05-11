package DIP;

public class LightSwitch {
    private Switchable device;
    private boolean isOn;

    public  LightSwitch(Switchable device){
        this.device = device;
        this.isOn = false;
    }

    public  void  toggle(){
        if (isOn) {
            device.turnOff();
            this.isOn = false;
        } else {
            device.turnOn();
            this.isOn = true;
        }
    }
}
