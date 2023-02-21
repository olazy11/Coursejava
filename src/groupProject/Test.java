package groupProject;

public class Test {
    public static void main(String[] args) {
   RemoteDriver [ ] rd = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver() };
        for (RemoteDriver x : rd) {
          x.open();
          x.close();
          x.getTitle();
          x.navigate();
          x.getScreenShot();
          System.out.println("Page title is: " + x.getTitle());

        }
    }
}
