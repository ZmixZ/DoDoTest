package appmanager;

import com.codeborne.selenide.SelenideElement;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import module.PizzaModel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PizzaHelper extends HelperBase{

    public void savePizzaModelsInFile(List<PizzaModel> pizza) throws IOException {
        File file = new File("src/test/resources/pizzaincart.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create(); //Сделать лист из двух пицц и их добавить в джейсон
        String json = gson.toJson(pizza);
        Writer writer = new FileWriter(file);
        writer.write(json);
        writer.close();
    }

    public List<PizzaModel> getPizzaModels() {
        List<PizzaModel> pizza = new ArrayList<>();

        SelenideElement firstPizza =  $("article.sc-157hvfs-0.jxUdnj:nth-child(2)");
        String name1 = firstPizza.$("h3.sc-157hvfs-3.hHqyE").getText();
        String parameter1 = firstPizza.$("div.sc-157hvfs-4.kpTbhD div").getText();
        int price1 = Integer.parseInt(firstPizza.$("span.money__value").getText());
        pizza.add(new PizzaModel()
                .withName(name1).withParameter(parameter1).withPrice(price1));

        SelenideElement twoPizza =  $("article.sc-157hvfs-0.jxUdnj:nth-child(3)");
        String name2 = twoPizza.$("h3.sc-157hvfs-3.hHqyE").getText();
        String parameter2 = twoPizza.$("div.sc-157hvfs-4.kpTbhD div").getText();
        int price2 = Integer.parseInt(twoPizza.$("span.money__value").getText());
        pizza.add(new PizzaModel()
                .withName(name2).withParameter(parameter2).withPrice(price2));
        return pizza;
    }

    public void makeRegularPizzaAndAddToCart() {
        clickElement("figure img[title='Чиззи чеддер']");
        List<SelenideElement> listConfig = $$("label.z6jeag-2.eMiiQc");
        for(SelenideElement i : listConfig){
            i.click();
        }
        List<SelenideElement> listTopping = $$("button.sc-1keftj-1.cnqrdx");
        for(SelenideElement i : listTopping){
            i.click();
            i.click();
        }
        clickElement("button.sc-1keftj-1.cnqrdx:nth-child(1)");
        clickElement("button.sc-1keftj-1.cnqrdx:nth-child(2)");
        clickElement("div.sc-15fdqut-17.fOLzOv");
    }

    public void makeCustomPizzaAndAddToCart() {
        clickElement("figure img[title='Пицца из половинок']");
        clickElement("div.sc-6x49ya-2.vKshE:nth-child(9)");
        clickElement("div.sc-6x49ya-2.vKshE:nth-child(10)");
        clickElement("label.z6jeag-2.eMiiQc");
        clickTextElement("Тонкое");
        clickElement("div.sc-1aajm7d-15.iwTQYS");
    }

    public void clickAndConfigPizza() {
        clickElement("figure img[title='Чиззи чеддер']");
        List<SelenideElement> listConfig = $$("label.z6jeag-2.eMiiQc");
        for(SelenideElement i : listConfig){
            i.click();
        }
        List<SelenideElement> listTopping = $$("button.sc-1keftj-1.cnqrdx");
        for(SelenideElement i : listTopping){
            i.click();
            i.click();
        }
        clickElement("button.sc-1keftj-1.cnqrdx:nth-child(1)");
        clickElement("button.sc-1keftj-1.cnqrdx:nth-child(2)");
        clickElement("div.sc-15fdqut-17.fOLzOv");
    }
}
