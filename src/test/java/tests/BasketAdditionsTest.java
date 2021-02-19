package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BasketAdditionsTest extends TestBase{

    @Test
    public void cartTest(){

        openURL();
        app.information().closeAlertAndNavigatePosition();
        app.pizza().clickAndConfigPizza();
        app.information().orderAndAdditionsAdd();
        closeWebDriver();

    }

}
