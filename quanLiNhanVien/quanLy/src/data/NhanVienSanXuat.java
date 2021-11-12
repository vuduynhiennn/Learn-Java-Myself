package data;

public class NhanVienSanXuat extends NhanVien implements ILuong {
    private double soSanPham;
    public NhanVienSanXuat(String maNhanVien, String hoVaTen, boolean gioiTinh, double luongCoBan, String diaChi, double soSanPham) {
        super(maNhanVien, hoVaTen, gioiTinh, luongCoBan, diaChi);
        // à quên nhắc em là hàm super kia nó đã gọi thằng constructor cha rồi, ở đây mình chỉ gắn mỗi soSanPham nuwac là đc, tương tự như bên kia 
        // ok a e moi hocj java dc 2 tuan 
        // nhieu ca chua nam ro
        this.soSanPham = soSanPham;
    }
    @Override 
    public double tinhLuong() {
        return soSanPham * 10 + luongCoBan;
    }
}
