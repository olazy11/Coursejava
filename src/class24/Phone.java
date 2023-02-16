package class24;

public abstract class Phone {
     abstract void displayPictures ();
     abstract  void unlockPhone ();
     abstract void sendText ();
}
class Iphone extends Phone {
        @Override
        void unlockPhone() {
            System.out.println("FaceID to unlock the Phone"); }
        @Override
        void displayPictures() {
            System.out.println("IPhoto to browse the pics");  }
        @Override
        void sendText() {
            System.out.println("IMessage to send texts");  } }
class Samsung extends Phone {
        @Override
    void displayPictures() {
        System.out.println("Gallery"); }
    @Override
    void unlockPhone() {
        System.out.println("Finger print ID");}
    @Override
    void sendText() {
        System.out.println("Messages app");}
}
class Google extends Phone {
    @Override
    void displayPictures() {
            }

    @Override
    void unlockPhone() {
    }

    @Override
    void sendText() {
    }
}