package class23;

public class WebDriveTester {
    public static void main(String[] args) {
      /*  WebDriver wb = new Chrome( );
        wb.openURL();
        wb.startBrwoser();
        wb.testLoginpage();
        wb.closeBrowser();*/

        WebDriver [] webBrowser = {new Chrome(), new Safari(), new Firefox()};
        for (WebDriver x : webBrowser) {
            x.startBrwoser();
            x.openURL();
            x.testLoginpage();
            x.closeBrowser();

        }

    }
}