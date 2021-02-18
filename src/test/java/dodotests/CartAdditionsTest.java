package dodotests;

import org.junit.jupiter.api.Test;

public class CartAdditionsTest extends TestBase{

    @Test
    public void cartTest(){

        openURL();
        app.information().closeAlertAndNavigatePosition();
        app.pizza().clickAndConfigPizza();
        app.information().clickTextElement("Корзина");
        app.information().additionsAdd();
        app.information().clickTextElement("Оформить заказ");

    }

}
