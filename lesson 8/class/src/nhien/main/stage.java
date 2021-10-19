package nhien.main;

import nhien.util.Mytoys;

public class stage {

    public static void main(String[] args) {
//        System.out.println("Math pi " + Mytoys.getPI());
//        System.out.println("Maht e " + Mytoys.E);
//        int n = Mytoys.getAnInteger("Moi lap lua chon cua ban");

        int choice;
        choice = Mytoys.getAnInteger("mời bạn nhập sự lựa chọn: ");
 
        System.out.println("Value of n is: " + choice);
    }
}
