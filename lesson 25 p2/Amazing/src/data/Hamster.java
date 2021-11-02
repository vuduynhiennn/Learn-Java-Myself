package data;

import java.util.Random;

public class Hamster extends Pet {
    public static final double MAX_SPEED = 10;
    public Hamster (String name, int YOB, double weight) {
        super(name, YOB, weight);
        this.name = name;
        this.YOB = YOB;
        this.weight = weight;
    }
    @Override 
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n", "HAMSTER", name, YOB, weight, run());
    }
    @Override
    public double run() {
        return new Random().nextDouble() * 40;
    }
}
