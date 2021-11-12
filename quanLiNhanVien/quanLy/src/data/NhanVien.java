package data;

import java.util.Scanner;

interface ILuong {
    double tinhLuong();
}

public class NhanVien {
    protected String maNhanVien;
    protected String hoVaTen;
    protected boolean gioiTinh;
    protected double luongCoBan;
    protected String diaChi;
    public NhanVien(String maNhanVien, String hoVaTen, boolean gioiTinh, double luongCoBan, String diaChi) {
        this.maNhanVien = maNhanVien;
        this.hoVaTen = hoVaTen;
        this.gioiTinh = gioiTinh;
        this.luongCoBan = luongCoBan;
        this.diaChi = diaChi;
    }
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }
    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaNhanVien() {
        return this.maNhanVien;
    }
    public String getHoVaTen() {
        return this.hoVaTen;
    }
    public double getLuongCoBan() {
        return this.luongCoBan;
    }
    public String getDiaChi() {
        return this.diaChi;
    }
    public String nhap() {
       // trong này em làm nhập lun
       Scanner sc;
       this.diaChi= sc.nextLine()// kiểu kiểu vậy,
    }
}
