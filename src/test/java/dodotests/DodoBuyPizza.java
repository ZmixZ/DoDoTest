package dodotests;


import com.codeborne.selenide.SelenideElement;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class DodoBuyPizza {

    @Test
    public void buyPizza() throws IOException {
        File file = new File("src/test/resources/pizza.json");
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
        $("div[data-testid='navigation__cart']").click();
  //      List<SelenideElement> listAdd = $$("div.sc-1xjzatr-4.jeWjRZ");
  //      for(SelenideElement i : listAdd) {
  //          i.click();
  //          $("button.sc-91ilwk-0.hmteXa.qqq9ws-3.dDwhHZ").click();
  //      }
   //     List<SelenideElement> listOrder = $$("article.sc-157hvfs-0.jxUdnj");
   //     for(int i = 4; i <= listOrder.size(); i++){
   //         $("article.sc-157hvfs-0.jxUdnj:nth-child(" + 2 + i + ") svg.sc-157hvfs-7.ZGosY").click();
   //     }

        SelenideElement firstPizza =  $("article.sc-157hvfs-0.jxUdnj:nth-child(2)");
        String name1 = firstPizza.$("h3.sc-157hvfs-3.hHqyE").getText();
        String parameter1 = firstPizza.$("div.sc-157hvfs-4.kpTbhD div").getText();
        int price1 = Integer.parseInt(firstPizza.$("span.money__value").getText());
        PizzaModel customPizza = new PizzaModel()
                .withName(name1).withParameter(parameter1).withPrice(price1);

        SelenideElement twoPizza =  $("article.sc-157hvfs-0.jxUdnj:nth-child(3)");
        String name2 = twoPizza.$("h3.sc-157hvfs-3.hHqyE").getText();
        String parameter2 = twoPizza.$("div.sc-157hvfs-4.kpTbhD div").getText();
        int price2 = Integer.parseInt(twoPizza.$("span.money__value").getText());
        PizzaModel regularPizza = new PizzaModel()
                .withName(name2).withParameter(parameter2).withPrice(price2);

        Gson gson = new GsonBuilder().setPrettyPrinting().create(); //Сделать лист из двух пицц и их добавить в джейсон
        String json = gson.toJson(customPizza);
        Writer writer = new FileWriter(file);
        writer.write(json);
        writer.close();


        $("button.sc-157aem8-2.joqjoD").click();
        $("button[data-testid='cart__button_next']").click();

    }
}
