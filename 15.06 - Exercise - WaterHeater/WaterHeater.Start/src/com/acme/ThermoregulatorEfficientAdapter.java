package com.acme;

import com.ventoelectrics.Thermoregulator;

public class ThermoregulatorEfficientAdapter implements Thermoregulator {
    private EfficientThermoregulator efficientThermoregulator;

    public ThermoregulatorEfficientAdapter(EfficientThermoregulator efficientThermoregulator) {
        System.out.println("ThemoregulatorEfficientAdapter created!");
        this.efficientThermoregulator = efficientThermoregulator;
    }

    @Override
    public void setTemperature(Integer temperature) {

    }

    @Override
    public void enablePower() {

    }

    @Override
    public void disablePower() {

    }
}