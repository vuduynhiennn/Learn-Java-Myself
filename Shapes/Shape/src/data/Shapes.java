package data;

public abstract class Shapes {
    protected String owner;
    protected String color;
    protected String borderColor;

    public Shapes(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }   
    public String getColor() {
        return this.color;
    }
    public String getOwner() {
        return this.owner;
    }
    public String getBorderColor() {
        return this.borderColor;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void paint();
}
