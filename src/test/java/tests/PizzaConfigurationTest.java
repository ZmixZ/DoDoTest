package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class PizzaConfigurationTest extends TestBase{

    @Test
    public void testAllPositionInConstructor(){

        openURL();
        app.information().closeAlertAndNavigatePosition();
        app.pizza().makeCustomPizzaAndAddToCart();
        closeWebDriver();

    }
}
