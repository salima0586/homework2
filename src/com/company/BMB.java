package com.company;

public class BMB extends CAR implements Printable{
    private String Motor;
    private String Volume;

    public BMB(String motor, String volume) {
        Motor = motor;
        Volume = volume;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String motor) {
        Motor = motor;
    }

    public String getVolume() {
        return Volume;
    }

    public void setVolume(String volume) {
        Volume = volume;
    }

    @Override
    public void print() {
        System.out.println("Motor"+ getMotor() + "\n Volume"+getVolume()
        );

    }
}
