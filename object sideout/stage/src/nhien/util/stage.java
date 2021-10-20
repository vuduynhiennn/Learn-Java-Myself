package nhien.util;

import student.util.Student;

public class stage {

    public static void main(String[] args) {
        checkObjectv1();
    }

    public static void checkObject() {
        Student nhien = new Student(0, "Vu Duy Nhien", "Y Yen Nam Dinh", 1, "12c6");
        Student linh = new Student(1, "Vu Duy Linh", "Y Yen Nam Dinh", 0, "12c1");

        nhien.showprofile();
        linh.showprofile();
    }
    public static void checkObjectv1() {
        Student s1 = new Student(0, "Vu Duy Phuong", "Y Yen Nam Dinh", 1, "12c6");
        Student s2 = s1;
        s2.setName("name was changed !");
        s2.showprofile();
        s1.showprofile();
    }
}
