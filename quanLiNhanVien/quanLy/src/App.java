import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import data.NhanVien;
import data.NhanVienSanXuat;
import data.NhanVienVanPhong;
import data.QuanLyNhanVien;

public class App {
    public static void main(String[] args) throws Exception {
        List<NhanVien> list = new ArrayList<NhanVien>();
        System.out.println("CHƯƠNG TRÌNH QUẢN LÍ NHÂN VIÊN");
        System.out.println("1: Nhập danh sách nhân viên");
        System.out.println("2: Hiển thị thông tin nhân viên");
        System.out.println("3: Tìm kiếm nhân viên");
        System.out.println("4: Nhân viên có lương cao nhất");
        System.out.println("5: Ghi nhân viên vào file");
        System.out.print("Mời bạn nhập: ");
        int option;
        Scanner os1 = new Scanner(System.in);
        option = os1.nextInt();
        switch (option) {
            case 1:
                // QuanLyNhanVien.nhapDanhSachNhanVien();
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            case 4:
                System.out.println("Case 4");
                break;
            case 5:
                System.out.println("Case 5");
                break;
            default:
                System.out.println("Bạn Nhập không hợp lệ: ");
        }
    }
}
