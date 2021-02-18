package dodotests;

import org.junit.jupiter.api.Test;

public class PizzaConfigurationTest extends TestBase{

    @Test
    public void testAllPositionInConstructor(){

        openURL();
        app.information().closeAlertAndNavigatePosition();
        app.pizza().makeCustomPizzaAndAddToCart();

    }
}
