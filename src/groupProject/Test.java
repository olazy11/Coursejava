package groupProject;

public class Test {
    public static void main(String[] args) {
        WebDriver[] wd = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (WebDriver x : wd) {
            x.open();
            x.close();
            System.out.println("Page title is: " + x.getTitle());

        }
    }
}
