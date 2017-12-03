package com.ventoelectrics;

import com.acme.EfficientThermoregulator;
import com.acme.StandardThermoregulator;
import com.acme.ThermoregulatorEfficientAdapter;
import com.acme.ThermoregulatorStandardAdapter;

import java.util.concurrent.TimeUnit;

public class WaterHeaterApplication {

    public static void main(String[] args) throws Exception {
        PowerSwitch powerSwitch = new PowerSwitch();
        Heater heater = new Heater();
        Thermometer thermometer = new Thermometer();
        Thermoregulator thermoregulator =
                new ThermoregulatorEfficientAdapter(new EfficientThermoregulator());

        //Thermoregulator thermoregulator =
          //      new ThermoregulatorStandardAdapter(new StandardThermoregulator());


        // Standard or efficient thermoregulator.

        WaterHeater waterHeater = new WaterHeater(powerSwitch, heater, thermometer, thermoregulator);

        simulateRun(waterHeater);
    }

    private static void simulateRun(WaterHeater waterHeater) {
        waterHeater.getThermoregulator().setTemperature(20);
        waterHeater.getPowerSwitch().turnOn();

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
        }

        waterHeater.getThermoregulator().setTemperature(40);

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
        }

        waterHeater.getPowerSwitch().turnOff();
    }
}
