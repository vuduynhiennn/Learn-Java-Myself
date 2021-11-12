package data;

public class Employees {
    protected String maNhanVien;
    protected String hoVaTenNhanVien;
    protected boolean gioiTinh;
    protected double luongCoBan;
    protected String diaChi;

    public Employees(String maNhanVien, String hoVaTenNhaString, boolean gioiTinh, double luongCoBan, String diaChi) {
        this.maNhanVien = maNhanVien;
        this.hoVaTenNhanVien = hoVaTenNhaString;
        this.gioiTinh = gioiTinh;
        this.luongCoBan = luongCoBan;
        this.diaChi = diaChi;
    }
}
