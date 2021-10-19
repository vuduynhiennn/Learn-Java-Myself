package nhien.util;

import java.util.Scanner;

public class Mytoys {

    private static final double PI = 3.1415926535897932384264;

    public static double getPI() {
        return PI;
    }
    public static final double E = 2.123812391823;

    //final = const
    private static Scanner sc = new Scanner(System.in);

    public static int getAnInteger(String inputMsg) {
        int n;

        do {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Do you know how to input an integer ? please, try again !");
            }
        } while (true);

    }

}
