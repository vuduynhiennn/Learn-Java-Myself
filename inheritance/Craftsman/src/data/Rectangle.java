package data;

/**
 *
 * @author vuduynhien
 */
public class Rectangle {

    private String owner;
    private String color;
    private double width;
    private double length;

    public Rectangle(String owner, String color, double width, double length) {
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "owner=" + owner + ", color=" + color + ", width=" + width + ", length=" + length + '}';
    }

    public void paint() {
        System.out.println("owner: " + owner + "\n" + "color: " + color + "\n" +"width: " + width + "\n" + "length " + length);
    }

}
