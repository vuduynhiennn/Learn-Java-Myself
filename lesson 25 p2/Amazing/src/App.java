import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;

public class App {
    public static void main(String[] args) throws Exception {
        showRecord();
    }

    public static void showRecord() {
        Pet racer[] = new Pet[] { new Dog("CHI HU HU", 2021, 0.5), // polimophism
                new Dog("CAU VANG", 1950, 10.5), new Cat("TOM", 1950, 15.0), new Cat("KITTY", 1990, 5.0),
                new Hamster("Jerry", 1960, 0.5) };

        for (Pet pet : racer) {
            pet.showRecord();
        }
    }

    public void sort() {
        
    }

}
