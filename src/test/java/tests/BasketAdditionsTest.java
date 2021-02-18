package tests;

import org.junit.jupiter.api.Test;

public class BasketAdditionsTest extends TestBase{

    @Test
    public void cartTest(){

        openURL();
        app.information().closeAlertAndNavigatePosition();
        app.pizza().clickAndConfigPizza();
        app.information().orderAndAdditionsAddStep();

    }

}
