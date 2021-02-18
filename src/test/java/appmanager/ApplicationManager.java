package appmanager;

public class ApplicationManager {

    private PizzaHelper pizzaHelper = new PizzaHelper();
    private InfoHelper infoHelper = new InfoHelper();

    public PizzaHelper pizza() {
        return pizzaHelper;
    }

    public InfoHelper information() {
        return infoHelper;
    }
}
