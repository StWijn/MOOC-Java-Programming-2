package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> l;
    private List<Integer> lijstMetReadings;

    public AverageSensor() {
        l = new ArrayList<>();
        lijstMetReadings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        l.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor s : l) {
            if (s.isOn() == false) {
                return false;
            }

        }
        return true;
    }

    @Override
    public void setOn() {
        l.forEach(s -> s.setOn());
    }

    @Override
    public void setOff() {
        l.forEach((s -> s.setOff()));
    }

    @Override
    public int read() {
       if ((isOn() == false) || l.isEmpty()) {
           throw new IllegalStateException();
       }
        double temp =  l.stream().mapToInt(s -> s.read()).average().getAsDouble();
       int i = (int) temp;
       lijstMetReadings.add(i);
       return i;
    }

    public List<Integer> readings() {
        return lijstMetReadings;
    }
}
