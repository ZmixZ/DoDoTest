package appmanager;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HelperBase {

    public void clickTextElement(String locator) {
        $(byText(locator)).click();
    }

    public void fillElement(String locator, String value) {
        $(byId(locator)).setValue(value);
    }

    public void clickElement(String locator) {
        $(locator).click();
    }
}
