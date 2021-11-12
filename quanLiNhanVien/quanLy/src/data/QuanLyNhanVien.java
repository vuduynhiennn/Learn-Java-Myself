package data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class QuanLyNhanVien {
        public void nhapDanhSachNhanVien() {
            int n;
            System.out.println("Nhập số lượng nhân viên: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            System.out.println("1: Nhập nhân viên văn phòng: ");
            System.out.println("2: Nhập nhân viên sản xuất: ");
            System.out.print("Nhập kiểu nhân viên: ");
            int type = sc.nextInt();
            switch (type) {
            case 1:
                for (int i = 0; i < n; i++) {
                    System.out.println("Nhập mã nhân viên: ");
                    String maNV = sc.nextLine();

                    System.out.println("Nhập họ tên: ");
                    String tenNV = sc.nextLine();

                    System.out.println("Nhập giới tính: ");
                    Boolean sex = sc.hasNextBoolean();

                    System.out.println("Nhập lương cơ bản: ");
                    double luongCB = sc.nextDouble();

                    System.out.println("Nhập địa chỉ: ");
                    String dc = sc.nextLine();

                    System.out.println("Nhập hệ số lương");
                    double hsl = sc.nextDouble();
                    list.add(new NhanVienVanPhong(maNV, tenNV, sex, luongCB, dc, hsl));
                }

                break;
            case 2:
                for (int i = 0; i < n; i++) {
                    System.out.println("Nhập mã nhân viên: ");
            
                    String maNV = sc.nextLine();
                    System.out.println("Nhập họ tên: ");
    
                    String tenNV = sc.nextLine();
                    System.out.println("Nhập giới tính: ");
            
                    Boolean sex = sc.hasNextBoolean();
                    System.out.println("Nhập lương cơ bản: ");
    
                    double luongCB = sc.nextDouble();
                    System.out.println("Nhập địa chỉ: ");

                    String dc = sc.nextLine();
                    System.out.println("Nhập số sản phẩm: ");
                    int sp;

                    sp = sc.nextInt();
                    list.add(new NhanVienSanXuat(maNV, tenNV, sex, luongCB, dc, sp));

                }

                break;
            default:
                System.out.println("Nhập sai rồi:  ");
            }

        }

        public void hienThiNhanVien() {
            for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getHoVaTen());
            }
        }

        public void timKiemNhanVien() {
            System.out.println("nhập họ tên nhân viên: ");
            String find = sc.nextLine();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getHoVaTen() == find) {
                    System.out.println(list.get(i).getHoVaTen());
                } else {
                    System.out.println("Không tìm thấy nhân viên trong danh sách");
                }
            }
        }

        public void nhanVienLuongCaoNhat() {

        }

        public void ghiDanhSach() {
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).gioiTinh == true && list.get(i).diaChi == "Đà Nẵng") {
                    try {
                        FileWriter fw = new FileWriter("D:\\git\\java-oop\\quanLiNhanVien\\quanLy\\src\\data_out.txt");
                        fw.write(list.get(i).getHoVaTen());
                        fw.write(list.get(i).getMaNhanVien());
                        fw.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println("Success...");
                }
            }
        } 
}
