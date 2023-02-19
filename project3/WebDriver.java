package project3;

public interface WebDriver {

    void open();

    void close();

    String getTitle();
}

interface RemoteWebDriver extends WebDriver{

    void navigate();
}

interface TakeScreenshot extends RemoteWebDriver{

    void getScreenshot();
}

class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }
}

class FireFoxDriver implements RemoteWebDriver{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }
}

class SafariDriver implements RemoteWebDriver{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }
}
