package data;

public class Square extends Rectangle {
    public Square(String owner, String color, String borderColor, double width) {
        super(owner, color, borderColor, width, width);
    }

    @Override
    public void paint() {
        System.out.printf("|SQUARE     |%-10s|%-10s|%-10s|%4.1f|    |%7.2f|\n",
                owner, color, borderColor, a, getArea()
        );
    }
}
