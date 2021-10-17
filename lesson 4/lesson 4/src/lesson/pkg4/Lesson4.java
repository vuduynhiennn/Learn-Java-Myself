package lesson.pkg4;

import data.DogManagerment;


public class Lesson4 {
    public static void main(String[] args) {  
        int age = 20;
        DogManagerment chiHu = new DogManagerment("Chi Hu Hu", 2020, 0.6);
        DogManagerment ngaoDa = new DogManagerment("Ngao da", 2020, 0.5);
        System.out.println("" + chiHu.getAge());
    }
}
