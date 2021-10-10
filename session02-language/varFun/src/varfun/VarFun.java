package varfun;

public class VarFun {

    public static void main(String[] args) {
//        playWithVariables();
//        playWithDoubles();
//        playWithCharacters();
//        playWithCharacters();
//        playWithBoolean();
          playWithIntererLists();
    }

    public static void playWithIntererLists() {
//        System.out.println("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27");
        for (int i = 0; i < 101; i++) {
            System.out.print(i + " ");
        }
    

    public static void playWithBoolean() {
        boolean marriedStatus = false;
        if (marriedStatus) {
            System.out.println("fuck em y");
        } else {
            System.out.println("fuck no ");
        }
    }

    public static void playWithCharacters() {
        //bang ma unicode
        char m = '$';
        System.out.println("m: " + m);
        String name = "Vu Duy Nhien";
        System.out.println("name: " + name);
        System.out.println("name: " + name.charAt(0));
        System.out.println("my name is : " + name.toUpperCase());

    }

    public static void playWithDoubles() {
        double pi = 3.14;
        System.out.println("pi: " + pi);
        System.out.printf("pi: %.2f\n", pi);
        float vat = 0.1F;
        System.out.println("vat: " + vat);
    }

    public static void playWithVariables() {
        int age = 20;
        int a = 10, b;
        b = 100;
        System.out.println("age: " + age);
        int yob = 2003;
        long number = 9000000000L;
        System.out.println("your current age: " + (2021 - yob));
        System.out.println("number: " + number);
        int status = 0xFA; // he 16
        int phone = 010;
        System.out.println("phone: " + phone);
    }
}
