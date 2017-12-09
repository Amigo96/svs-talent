package es.lamp;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class Lamp {

    public void turnOn() {
        System.out.println("es.lamp.Lamp.turnOn");
    }

    public void turnOff() {
        System.out.println("es.lamp.Lamp.turnOff");
    }
}
