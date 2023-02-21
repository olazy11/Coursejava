package groupProject;

public interface WebDriver {
    void open();
    void close();
    String getTitle ();}

interface RemoteDriver extends WebDriver, TakesScreenShots {

void navigate();

}
interface TakesScreenShots  {

    void getScreenShot();

    }

class ChromeDriver implements RemoteDriver {
 String webPage = "https://www.google.com/intl/ru_ru/chrome/";
 String title = "Chrome";

    @Override
    public void open() {
        System.out.println("ChromeDriver opens");
    }

    @Override
    public void close() {
        System.out.println("ChromeDriver closes");
    }

    @Override
    public String getTitle() {
        if (webPage.contains("chrome")) {
            return title;    }
        return null;}

    @Override
    public void navigate() {
        System.out.println("ChromeDriver navigates");
    }
    public void getScreenShot() {
        System.out.println("ChromeDriver takes screens");
    }

}
class FirefoxDriver implements RemoteDriver {
    String webPage = "https://www.mozilla.org/ru/firefox/new/";
    String title = "Firefox";

    @Override
    public void navigate() {
        System.out.println("Firefox navigates");
    }

    @Override
    public void open() {
        System.out.println("Firefox opens");
    }

    @Override
    public void close() {
        System.out.println("Firefox closes");

    }
    @Override
    public String getTitle() {
        if (webPage.contains("firefox")) {        return title;    }    return null;
    }

    public void getScreenShot() {
        System.out.println("Firefox takes screens");
    }
}

class SafariDriver implements RemoteDriver {

    String webPage = "https://www.apple.com/ru/safari/";
    String title = "Safari";

    @Override
    public void open() {
        System.out.println("Safari opens");
    }

    @Override
    public void close() {
        System.out.println("Safari closes");

    }

    @Override
    public String getTitle() {
        if (webPage.contains("safari")) {        return title;    }    return null;
    }

public void getScreenShot() {
    System.out.println("Safari takes screens");
}
    @Override
    public void navigate() {
        System.out.println("Safari navigates");

    }


}

