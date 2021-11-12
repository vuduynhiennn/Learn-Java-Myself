package data;

interface ILuong {
    double tinhLuong();
}

public class NhanVien {
    protected String id;
    protected String name;
    protected int yob;
    protected double gpa;
    public NhanVien(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }
    public void showProfile() {
        
    }
}
