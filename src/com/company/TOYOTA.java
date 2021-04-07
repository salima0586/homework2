package com.company;

public class TOYOTA extends CAR implements Printable{
    private String truba;
    private int wheel;

    public TOYOTA(String truba, int wheel) {
        this.truba = truba;
        this.wheel = wheel;
    }

    public String getTruba() {
        return truba;
    }

    public void setTruba(String truba) {
        this.truba = truba;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public void print() {
        System.out.println("wheel"+ getWheel() + "\n Truba"+getTruba()
        );

    }
}
