package appmanager;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HelperBase {

    public void clickByElement(By locator) { $(locator).click(); }

    public void fillElement(By locator, String value) {
        $(locator).setValue(value);
    }

    public void clickElement(String locator) { $(locator).click(); }

}
