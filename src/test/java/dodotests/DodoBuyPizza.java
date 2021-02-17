package dodotests;


import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DodoBuyPizza {

    @Test
    public void buyPizza(){
        open("https://dodopizza.ru/moscow");
        $("span button.cookie-policy__button").click();
        $("li.ymp2tw-2.hfBzCp:nth-child(1)");
        $("figure img[title='Пицца из половинок']").click();
        List<SelenideElement> listLeftSidePizza = $$("div.sc-6x49ya-2.vKshE");
        for(SelenideElement i : listLeftSidePizza){
            i.click();
            $("div.sc-6x49ya-2.eqYVAK").click();
        }
        $("div.sc-6x49ya-2.vKshE:nth-child(9)").click(); // click another pizza
        List<SelenideElement> listRightSidePizza = $$("div.sc-6x49ya-2.vKshE");
        for(SelenideElement i : listRightSidePizza){
            i.click();
            $("div.sc-6x49ya-2.eythrd").click();
        }
        $("div.sc-6x49ya-2.vKshE:nth-child(10)").click(); // click
        List<SelenideElement> listingridients =  $$("button.sc-1hrv7kf-3.dhaJEk");
        for(SelenideElement i : listingridients){
            i.click();
            i.click();
        }
        $("label.z6jeag-2.eMiiQc").click();
        $("div.sc-1aajm7d-15.iwTQYS").click();
        $("figure img[title='Чиззи чеддер']").click();
        for(SelenideElement i : listingridients){
            i.click();
            i.click();
        }
        List<SelenideElement> listConfig = $$("label.z6jeag-2.eMiiQc");
        for(SelenideElement i : listConfig){
            i.click();
        }

        List<SelenideElement> listTopping = $$("button.sc-1keftj-1.cnqrdx");
        for(SelenideElement i : listTopping){
            i.click();
            i.click();
        }
        $("button.sc-1keftj-1.cnqrdx:nth-child(1)").click();
        $("button.sc-1keftj-1.cnqrdx:nth-child(2)").click();
        $("div.sc-15fdqut-17.fOLzOv").click();

    }
}
