package appmanager;

import com.codeborne.selenide.SelenideElement;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class InfoHelper extends HelperBase{
    ApplicationManager app;

    public InfoHelper(ApplicationManager app){
        this.app = app;
    }

    public void fillContactAndDeliveryForm() {
        fillElement(byId("nm-input"), "Рофлан Петрович");
        clickElement("div.input-container a");
        clickByElement(byText("11:30"));
        clickByElement(byText("Наличными"));
        clickElement("button.sc-91ilwk-0.hmteXa.sc-1fb8x0h-1.kxjUMr");
    }

    public void closeAlertAndNavigatePosition() {
        if($("span.cookie-policy__container").exists()){
            clickElement("span button.cookie-policy__button");
            clickByElement(byText("Пицца"));
        }
        else
        clickByElement(byText("Пицца"));
    }

    public void additionsAdd() {
        List<SelenideElement> listAdd = $$("div.sc-1xjzatr-4.jeWjRZ");
        for(SelenideElement i : listAdd) {
            i.click();
            clickElement("button.sc-91ilwk-0.hmteXa.qqq9ws-3.dDwhHZ");
        }
    }

    public void orderAndAdditionsAdd(){
        clickByElement(byText("Корзина"));
        additionsAdd();
        clickByElement(byText("Оформить заказ"));
    }

    public void ordering() throws IOException {
        clickByElement(byText("Корзина"));
        app.pizza().savePizzaModelsInFile();
        clickByElement(byText("Оформить заказ"));
    }
}
