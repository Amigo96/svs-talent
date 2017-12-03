package at;

public class ConsoleAlarmChannel implements AlarmTrigger {
    public ConsoleAlarmChannel() {
        System.out.println("ConsoleAlarmChannel constructor called");
    }

    public void report() {
        System.out.println("AlarmTrigger activated !!!!!! ");
    }
}
