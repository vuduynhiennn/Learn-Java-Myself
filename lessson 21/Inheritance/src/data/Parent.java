package data;

public class Parent {
    protected String assetsOne; // a house
    protected String assetsTwo;
    public Parent(String assetsOne, String assetsTwo) {
        this.assetsOne = assetsOne;
        this.assetsTwo = assetsTwo;
    }
    public void showProfile() {
        System.out.println("Parent > : assets 1: " + assetsOne + " assets 2: " + assetsTwo); 
    }
    
    @Override 
    public String toString() {
        return "assets 1: " + assetsOne + " assetsTwo: " + assetsTwo;
    }

}
