package student.util;

public class Student {
    private int id;
    private String name;
    private String address;
    private int age;
    private String grade;

    public Student(int id, String name, String address, int age, String grade) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.grade = grade;
    }
    
    public void showprofile() {
        System.out.println("Student: " + this.id + " has a name: " + this.name);
        System.out.println("age " + this.age);
        System.out.println("address " + this.address);
        System.out.println("grade " + this.grade);
        System.out.println("========================");
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
