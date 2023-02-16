package class24;

public class PhoneTester {
    public static void main(String[] args) {
        Phone[] ph = {new Iphone(), new Samsung()};
        for (Phone f:ph) {
            f.unlockPhone();
            f.displayPictures();
            f.sendText();

        }
    }
}
