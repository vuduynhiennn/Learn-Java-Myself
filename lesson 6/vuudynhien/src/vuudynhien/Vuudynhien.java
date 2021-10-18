package vuudynhien;

import java.util.Scanner;

public class Vuudynhien {

    public static void main(String[] args) {
        inputProfile();
    }

    public static void inputProfile() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        whiletr(true) { // lặp vô tận
            try {
                // lệnh cà chớn 
                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine()); // convert data tu ban phim chuoi thanh s 
                break;
                
            } catch (Exception e) {
                System.out.println("do ku know to input a possitive number ?");
            }
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile: ");
        System.out.println("name : " + name);
        System.out.println("address : " + address);
        System.out.println("yob : " + yob);
    }
}
