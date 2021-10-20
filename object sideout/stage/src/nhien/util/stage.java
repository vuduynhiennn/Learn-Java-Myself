package nhien.util;

import student.util.Student;

public class stage {

    public static void main(String[] args) {
        checkObject();
    }

    public static void checkObject() {
        Student nhien = new Student(0, "Vu Duy Nhien", "Y Yen Nam Dinh", 1, "12c6");
        Student linh = new Student(1, "Vu Duy Linh", "Y Yen Nam Dinh", 0, "12c1");

        nhien.showprofile();
        linh.showprofile();
    }
}
