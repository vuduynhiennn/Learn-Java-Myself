package data;

public NhanVienVanPhong extends NhanVien implements ILuong {
    private double heSoLuong;
    public NhanVienVanPhong(String maNhanVien, String hoVaTen, boolean gioiTinh, double luongCoBan, String diaChi, double heSoLuong) {
        super(maNhanVien, hoVaTen, gioiTinh, luongCoBan, diaChi);
        this.heSoLuong = heSoLuong;
    }
    @Override 
    public double tinhLuong() {
        return 2.4 * heSoLuong;
    }
    bên nà override lại method nhập // đề bài yêu cầu viesete class quản lí riêng á anh
    /// nên e mới thấy nó khó hiểu, mọi method nhập xuất tìm kiếm thì ở trong 1 class riêng, kì 
}
