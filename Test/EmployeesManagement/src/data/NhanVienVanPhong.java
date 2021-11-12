package data;
import data.*;

public class NhanVienVanPhong extends NhanVien implements ILuong {
    public NhanVienVanPhong(String id, String name, int yob, double gpa) {
        super(id, name, yob, gpa);
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }
    @Override
    public void showProfile() {
        System.out.println("hello");
    }
    @Override 
    public double tinhLuong() {
        return 3.2;
    }
}
