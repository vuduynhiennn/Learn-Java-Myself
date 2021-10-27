import data.Child;
import data.Parent;

public class App {
    public static void main(String[] args) throws Exception {
        playWithParentNChild();
        playWithChild();
    }
    public static void playWithParentNChild() {
        Parent p = new Parent("Biệt thự", "100BTC");
        p.showProfile();
    }
    public static void playWithChild() {
        Child n1 = new Child("Biệt thự to", "gái ngực đẹp");
        Parent c2 = new Child("Gái ngực to", "gái xinh");
        c2.showProfile();
        n1.showProfile();
    }

}
