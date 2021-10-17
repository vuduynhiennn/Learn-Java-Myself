package data;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int yob;
    private double gpa; // grade point average  
    public Student(int id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }
}
