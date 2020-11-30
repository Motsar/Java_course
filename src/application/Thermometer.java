package application;

import java.util.Random;

public class Thermometer implements Sensor {
    private boolean state;


    public Thermometer(){
        this.state = false;
    }

    @Override
    public boolean isOn(){
        return this.state;
    }

    @Override
    public void on() {
        this.state=true;
    }

    @Override
    public void off() {
        this.state =false;
    }

    @Override
    public int measure() {
        Random number = new Random();
        if(!state){ // if state is off
            throw new IllegalArgumentException("Set Thermometer state to on before measuring it!.");
        }
        return number.nextInt(30 - -30) + -30; // random number between -30 to 30
    }


}
