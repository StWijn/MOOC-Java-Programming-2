package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean schakelaar;

    public TemperatureSensor() {
        schakelaar = false;
    }

    @Override
    public boolean isOn() {
        return this.schakelaar;
    }

    @Override
    public void setOn() {
        schakelaar = true;
    }

    @Override
    public void setOff() {
        schakelaar = false;
    }

    @Override
    public int read() {
        if (schakelaar == false) {
            throw new IllegalStateException();

        }
        return new Random().nextInt(61) - 30;
    }
}
