package com.acme;

import com.ventoelectrics.Thermoregulator;

public class ThermoregulatorStandardAdapter implements Thermoregulator {
    private StandardThermoregulator standardThermoregulator ;

    public ThermoregulatorStandardAdapter(StandardThermoregulator standardThermoregulator){
        System.out.println("ThemoregulatorStandardAdapter created!");
        this.standardThermoregulator = standardThermoregulator;
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
