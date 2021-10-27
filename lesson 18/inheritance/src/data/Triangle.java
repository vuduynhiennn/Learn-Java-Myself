package data;

public class Triangle {
    protected String owner;
    protected String color;
    protected double a, b, c;

    public Triangle(String owner, String color, double a, double b, double c) {
        this.owner = owner;
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String getOwer() {
        return this.owner;
    }
    public String getColor() {
        return this.color;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    @Override
    public String toString() {
        return "ownver " + owner + " color: " + color + " a:  " + a + " b: " + b + " c: " + c;
    }
    public double getPerimeter() {
        return a + b + c;
    } 
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public void paint() {
        System.out.printf("|Triangle |%-15s|%-10s|%4.1f|%4.1f|%4.1f|%7.2f|\n",
                                owner, color, a, b, c, getArea());
    }
}
