package data;

public abstract class Pet {
    protected String name;
    protected int YOB;
    protected double weight;
    public Pet(String name, int YOB, double weight) {
        this.name = name;
        this.YOB = YOB;
        this.weight = weight;
    }
    public String getName() {
        return this.name;
    }
    public int YOB() {
        return this.YOB;
    }
    public double weight() {
        return this.weight;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setYOB(int YOB) {
        this.YOB = YOB;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public abstract double run();
    public abstract void showRecord();
}

