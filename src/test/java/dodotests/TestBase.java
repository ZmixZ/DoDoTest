package dodotests;

import appmanager.ApplicationManager;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    protected static final ApplicationManager app = new ApplicationManager();

    public void openURL() {
        open("https://dodopizza.ru/moscow");
    }

    public void authorization() {
        app.information().fillElement("phn-input", "----------");
        app.information().clickTextElement("Выслать код");
    }

    public ApplicationManager getApp() {
        return app;
    }
}
