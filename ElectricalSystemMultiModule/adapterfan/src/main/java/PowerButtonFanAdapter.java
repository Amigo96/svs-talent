public class PowerButtonFanAdapter implements PoweredDevice {

    private Fan fan;

    public PowerButtonFanAdapter(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void enable() {
        fan.turnOn();
    }

    @Override
    public void disable() {
        fan.turnOff();
    }
}
