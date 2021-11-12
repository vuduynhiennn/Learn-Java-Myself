public class WrapperClass {
    public static void main(String[] args) {
        System.out.println("hello this time I fucking this language");
        playWithInteger();
        playWithPool();
    }
    public static void playWithPool() {
        Integer num4 = 2000;
        Integer num5 = 2000;
        System.out.println(num4);
    }
    public static void playWithInteger() {
        Integer num1 = new Integer("2003");
        Integer num2 = new Integer(2003);
        int num3 = 2003;
        if (num1.intValue() == num2.intValue()) {
            System.out.println("This is the same");
        }
    }
}
