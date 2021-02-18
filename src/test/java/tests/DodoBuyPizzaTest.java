package tests;


import org.junit.jupiter.api.Test;
import java.io.IOException;

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

    }

}
