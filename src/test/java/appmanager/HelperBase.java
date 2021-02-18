package appmanager;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HelperBase {

    public void clickTextElement(String s) {
        $(byText(s)).click();
    }

    public void fillElement(String s, String s2) {
        $(byId(s)).setValue(s2);
    }

    public void clickElement(String s) {
        $(s).click();
    }
}
