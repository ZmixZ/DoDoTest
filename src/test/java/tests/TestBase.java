package tests;

import appmanager.ApplicationManager;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    protected static final ApplicationManager app = new ApplicationManager();

    public void openURL() {
        open("https://dodopizza.ru/moscow");
    }

    public void authorization() {
        app.information().fillElement(byId("phn-input"), "----------");
        app.information().clickByElement(byText("Выслать код"));
        //доделать смс-пароль и капчу-скип
    }

    public ApplicationManager getApp() {
        return app;
    }
}
