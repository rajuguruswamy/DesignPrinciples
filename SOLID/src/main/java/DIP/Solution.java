package DIP;

public class Solution {
    public static void main(String[] args) {
        Switchable lightBulb = new LightBulb();
        LightSwitch lightSwitch = new LightSwitch(lightBulb);

        lightSwitch.toggle();
        lightSwitch.toggle();


    }
}
