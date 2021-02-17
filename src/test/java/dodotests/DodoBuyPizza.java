package dodotests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class DodoBuyPizza {

    @Test
    public void buyPizza(){
        Selenide.open("https://dodopizza.ru");
        
    }
}
