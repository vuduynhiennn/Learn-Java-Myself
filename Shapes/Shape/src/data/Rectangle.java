package data;

public class Rectangle extends Shapes {
    protected double a, b;
    public Rectangle(String owner, String color, String borderColor, double a, double b) {
        super(owner, color, borderColor);
        this.a = a;
        this.b = b;
    }
    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    @Override
    public double getArea() {
        return this.a * this.b;
    }

    @Override
    public double getPerimeter() {
        return (this.a + this.b) * 2; 
    }

    @Override
    public void paint() {
        System.out.printf("|REACTANGLE |%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n",
            owner, color, borderColor, a, b, getArea()  
        );
    }
}
