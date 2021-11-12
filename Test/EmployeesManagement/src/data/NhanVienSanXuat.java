package data;
import data.*;

public class NhanVienSanXuat extends NhanVien implements ILuong {
    private double heSoLuong;
    private double soSanPham;
    public NhanVienSanXuat(String id, String name, int yob, double gpa, double soSanPham) {
        super(id, name, yob, gpa);
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
        this.soSanPham = soSanPham;
    }
    @Override
    public void showProfile() {
        System.out.println("hello");
        double x = this.soSanPham;
    };
    @Override
    public double tinhLuong() {
        return gpa * heSoLuong;
    }
}
