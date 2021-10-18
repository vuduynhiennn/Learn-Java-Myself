package students;

import Student;

public class Students {

    public static void main(String[] args) {
        saveStudent();
    }

    public static void saveStudent() {
        Student nhien = new Student("Vu Duy Nhien", 000, "Nam Định", 2003);
        Student duy = new Student("Vu Duy Khanh", 001, "Hà Nội", 2002);
    }

}
