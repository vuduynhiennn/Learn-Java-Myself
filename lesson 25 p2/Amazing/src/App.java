import java.util.Random;
import java.util.Scanner;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;

public class App {
    public static void main(String[] args) throws Exception {
        showRecord();
        playWithAnonymousClass();
    }


    public static void showRecord() {
        Pet racer[] = new Pet[] { new Dog("CHI HU HU", 2021, 0.5), // polymophism
                new Dog("CAU VANG", 1950, 10.5), new Cat("TOM", 1950, 15.0), new Cat("KITTY", 1990, 5.0),
                new Hamster("Jerry", 1960, 0.5) };

        for (Pet pet : racer) {
            pet.showRecord();
        }
    }
        public static void playWithAnonymousClass() {
            new Pet("GHOST", 1999, 154.0) {
                public static final double MAX_SPEED = 30;
                @Override
                public void showRecord() {
                    System.out.printf("|%-10s|%4d|%4.1f|%4.1f|\n", name, YOB, weight, run());
                }

                @Override
                public double run() {
                    return new Random().nextDouble() * MAX_SPEED;
                }
            }.showRecord();;
        }

}
