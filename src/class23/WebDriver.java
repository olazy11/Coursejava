package class23;

public class WebDriver {
    public void startBrwoser () {
        System.out.println("starting the browser");
    }

    public void openURL () {
        System.out.println("opening a URL");
    }
    public void testLoginpage (){
        System.out.println("testing the login page");
    }
    public void closeBrowser () {
        System.out.println("closing login page");
    }
}
class Chrome extends WebDriver {
    @Override
    public void startBrwoser() {

        System.out.println("starting the browser in Chrome ");
    }

    @Override
    public void openURL() {

        System.out.println("opening a URL in Chrome");
    }

    @Override
    public void testLoginpage() {

        System.out.println("testing the login page in Chrome");

    }

    @Override
    public void closeBrowser() {

        System.out.println("closing login page in Chrome");
    }

}
class Safari extends WebDriver{
    @Override
    public void startBrwoser() {

        System.out.println("starting the browser in Safari ");
    }

    @Override
    public void openURL() {

        System.out.println("opening a URL in Safari ");
    }

    @Override
    public void testLoginpage() {

        System.out.println("testing the login page in Safari ");

    }

    @Override
    public void closeBrowser() {

        System.out.println("closing login page in Safari");
    }
}
class Firefox extends WebDriver {
    @Override
    public void startBrwoser() {
        System.out.println("starting the browser in FireFox");
    }

    @Override
    public void openURL() {
        System.out.println("opening a URL in FireFox ");

    }

    @Override
    public void testLoginpage() {
        System.out.println("testing the login page in FireFox ");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing login page in FireFox");
    }
}