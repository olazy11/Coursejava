package groupProject;

public interface WebDriver {
    void open();
    void close();
    String getTitle ();}

interface RemoteDriver extends WebDriver {

void navigate();
    @Override
    default void open() {
        System.out.println("RemoteDriver opens");
    }
    @Override
    default void close() {
        System.out.println("RemoteDriver closes");    }

    @Override
    default String getTitle() {
        return null;    }
}

interface TakesScreenShots extends RemoteDriver {

    void getScreenShot ();}

class ChromeDriver implements RemoteDriver {
static String webPage = "https://www.google.com/intl/ru_ru/chrome/";
static String title = "Chrome";

    @Override
    public void open() {
        System.out.println("ChromeDriver opens");    }
    @Override
    public void close() {
        System.out.println("ChromeDriver closes");
    }
    @Override
    public String getTitle() {
        if (webPage.contains("chrome")) {
            return title;
        }
        return null;
    }


    public ChromeDriver() {
    }

    @Override
    public void navigate() {
        System.out.println("ChromeDriver navigates");
    }
}
class FirefoxDriver implements RemoteDriver{
static String webPage = "https://www.mozilla.org/ru/firefox/new/";
static String title = "Firefox";
    @Override
    public void open() {
        System.out.println("Firefox opens");    }

    @Override
    public void close() {
        System.out.println("Firefox closes");    }

    @Override
    public String getTitle() {
        if (webPage.contains("firefox")) {
            return title;

        }
        return null;
    }
    @Override
    public void navigate() {
        System.out.println("Firefox navigates");    }
}
class SafariDriver implements RemoteDriver {
    static String webPage = "https://www.apple.com/ru/safari/";
    static String title = "Safari";

    @Override
    public void open() {
        System.out.println("SafariDriver opens");
    }

    @Override
    public void close() {
        System.out.println("SafariDriver closes");
    }

    @Override
    public String getTitle() {
        if (webPage.contains("safari")) {
            return title;
        }
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("SafariDriver navigates");
    }
}
