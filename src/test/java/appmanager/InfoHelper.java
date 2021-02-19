package appmanager;

import com.codeborne.selenide.SelenideElement;
import java.io.IOException;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class InfoHelper extends HelperBase{
    ApplicationManager app;

    public InfoHelper(ApplicationManager app){
        this.app = app;
    }

    public void fillContactAndDeliveryForm() {
        fillElement("nm-input", "Рофлан Петрович");
        clickElement("div.input-container a");
        clickTextElement("11:30");
        clickTextElement("Наличными");
        clickElement("button.sc-91ilwk-0.hmteXa.sc-1fb8x0h-1.kxjUMr");
    }

    public void closeAlertAndNavigatePosition() {
        if($("span.cookie-policy__container").exists()){
            clickElement("span button.cookie-policy__button");
            clickTextElement("Пицца");
        }
        else
        clickTextElement("Пицца");
    }

    public void additionsAdd() {
        List<SelenideElement> listAdd = $$("div.sc-1xjzatr-4.jeWjRZ");
        for(SelenideElement i : listAdd) {
            i.click();
            clickElement("button.sc-91ilwk-0.hmteXa.qqq9ws-3.dDwhHZ");
        }
    }

    public void orderAndAdditionsAdd(){
        clickTextElement("Корзина");
        additionsAdd();
        clickTextElement("Оформить заказ");
    }

    public void ordering() throws IOException {
        clickTextElement("Корзина");
        app.pizza().savePizzaModelsInFile();
        clickTextElement("Оформить заказ");
    }
}
