import java.util.concurrent.ForkJoinPool;

import data.*;

public class App {
    public static void main(String[] args) throws Exception {
        sortShapes();
    }

    public static void sortShapes() {
        Rectangle r1 = new Rectangle("Tía", "pink", "magenta", 5.0, 6.0);
        Shapes r2 = new Rectangle("Tía", "magenta", "pink", 6.0, 5.0);

        Rectangle s1 = new Square("Má", "pink", "magenta", 7.0);
        Rectangle s2 = new Square("Má", "pink", "magenta", 8.0);
        Rectangle s3 = new Square("Má", "pink", "mageta", 9.0);

        Shapes d1 = new Disk("Bé na", "rainbow", "rainbow", 2.0);
        Shapes d2 = new Disk("Ghệ bé na", "rainbow", "rainbow", 1.0);
        Shapes arr1[] = new Shapes[7];
        arr1[0] = r1;
        arr1[1] = r2;
        arr1[2] = s1;
        arr1[3] = s2;
        arr1[4] = s3;
        arr1[5] = d1;
        arr1[6] = d2;
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i].getArea() > arr1[j].getArea()) { 
                        Shapes tmp = arr1[i]; // polymophism
                        arr1[i] = arr1[j];    // abstract  
                        arr1[j] = tmp;
                }
            }
        }
        System.out.println("this is a list of shapes: ");
        for (Shapes shapes : arr1) {
            shapes.paint();
        }
    }
 
}
