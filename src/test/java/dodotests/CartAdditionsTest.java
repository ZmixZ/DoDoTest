package dodotests;

import org.junit.jupiter.api.Test;

public class CartAdditionsTest extends TestBase{

    @Test
    public void cartTest(){

        openURL();
        closeAlertAndNavigatePosition();
        clickAndConfigPizza();
        clickTextElement("Корзина");
        additionsAdd();
        clickTextElement("Оформить заказ");

    }

}
