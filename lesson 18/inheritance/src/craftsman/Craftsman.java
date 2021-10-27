package craftsman;

import data.Triangle;

public class Craftsman {
    public static void main() {
        System.out.println("hello world, watch me code an object");
        playWithTriangle();
    }
    public static void playWithAngle() {

    }
    public static void playWithTriangle() {
        Triangle t1 = new Triangle("Vu Duy Nhien", "red", 3, 4, 5);
        t1.paint();
    }
}
