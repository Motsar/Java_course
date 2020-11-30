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
        int randomNum = 0;
        Random number = new Random();
        if(!isOn()){
            System.out.println("sensor is off");
        }else{
            randomNum = number.nextInt(61) - 30;    
        }
        return randomNum;
    }


}
