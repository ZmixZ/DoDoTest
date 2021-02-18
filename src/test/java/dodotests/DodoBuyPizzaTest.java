package dodotests;


import module.PizzaModel;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class DodoBuyPizzaTest extends TestBase{

    @Test
    public void buyPizza() throws IOException {

        openURL();
        app.information().closeAlertAndNavigatePosition();
        app.pizza().makeCustomPizzaAndAddToCart();
        app.pizza().makeRegularPizzaAndAddToCart();
        app.information().clickTextElement("Корзина");
        app.pizza().savePizzaModelsInFile();
        app.information().clickTextElement("Оформить заказ");
        authorization();
        app.information().fillContactAndDeliveryForm();

    }

}
