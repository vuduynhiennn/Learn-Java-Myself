package data;

public class Child extends Parent {
    private String assetsThree;

    public Child(String assetsOne, String assetsTwo, String assetsThree) {
        super(assetsOne, assetsTwo);
        this.assetsThree = assetsThree;
    }

    @Override
    public void showProfile() {
        System.out.println("Child > assets1: " + assetsOne + " assets2: " + assetsTwo);
    }
    public String getAssetsThree() {
        return this.assetsThree;
    }
    public void setAssetsThree(String assetsThree) {
        this.assetsThree = assetsThree;
    }

}
