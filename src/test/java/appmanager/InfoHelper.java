package appmanager;

import com.codeborne.selenide.SelenideElement;
import java.util.List;
import static com.codeborne.selenide.Selenide.$$;

public class InfoHelper extends HelperBase{

    public void fillContactAndDeliveryForm() {
        fillElement("nm-input", "Рофлан Петрович");
        clickElement("div.input-container a");
        clickTextElement("11:30");
        clickTextElement("Наличными");
    }

    public void closeAlertAndNavigatePosition() {
        clickElement("span button.cookie-policy__button");
        clickElement("li.ymp2tw-2.hfBzCp:nth-child(1)");
    }

    public void additionsAdd() {
        List<SelenideElement> listAdd = $$("div.sc-1xjzatr-4.jeWjRZ");
        for(SelenideElement i : listAdd) {
            i.click();
            clickElement("button.sc-91ilwk-0.hmteXa.qqq9ws-3.dDwhHZ");
        }
    }
}
