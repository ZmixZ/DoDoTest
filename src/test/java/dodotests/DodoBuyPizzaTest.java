package dodotests;


import module.PizzaModel;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class DodoBuyPizzaTest extends TestBase{

    @Test
    public void buyPizza() throws IOException {

        openURL();
        closeAlertAndNavigatePosition();
        makeCustomPizzaAndAddToCart();
        makeRegularPizzaAndAddToCart();
        clickTextElement("Корзина");
        List<PizzaModel> pizza = getPizzaModels();
        savePizzaModelsInFile(pizza);
        clickTextElement("Оформить заказ");
        fillContactAndDeliveryForm();
        clickTextElement("Оформить заказ на");

    }

}
