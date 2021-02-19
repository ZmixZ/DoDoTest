package tests;


import org.junit.jupiter.api.Test;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class DodoBuyPizzaTest extends TestBase{

    @Test
    public void buyPizza() throws IOException {

        openURL();
        app.information().closeAlertAndNavigatePosition();
        app.pizza().makeCustomPizzaAndAddToCart();
        app.pizza().makeRegularPizzaAndAddToCart();
        app.information().ordering();
        authorization();
        app.information().fillContactAndDeliveryForm();
        closeWebDriver();

    }

}
