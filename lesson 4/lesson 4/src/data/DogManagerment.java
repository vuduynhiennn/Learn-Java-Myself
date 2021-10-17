package data;

import java.util.logging.Logger;

 public class DogManagerment {

    private String name;
    private int yob;
    private double weight;
    public String hello;

    public DogManagerment(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }
    public void Bark() {
        System.out.println("go go go go, my name is " + name);
        System.out.println("my yob is" + yob);
        int ahiahi = 68;
        System.out.println("ahiahi: " + ahiahi);
    }

//    @Override
//    // giong overload nhung lien quan den polimorphism
//    public String toString() {
////        return "DogManagerment{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
//        String tmpMsg = String.format(this.name)
//        return tmpMsg
//    }
    public int getAge() {
        return 2021 - yob;
    }
}
    