package craftsman;

import data.Rectangle;

/**
 *
 * @author vuduynhien
 */
public class Craftsman {
    public static void main(String[] args) {
        // TODO code application logic here
        cutShapes();
    }
    public static void cutShapes() {
        Rectangle r1 = new Rectangle("Vu Duy Nhien", "red", 1.0, 2.0);
        r1.paint();
    }
    
}
