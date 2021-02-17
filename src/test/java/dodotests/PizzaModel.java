package dodotests;

import java.util.Objects;

public class PizzaModel {

    String name;
    String parameter;
    int price;

    public String getName() {
        return name;
    }

    public PizzaModel withName(String name) {
        this.name = name;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public PizzaModel withPrice(int price) {
        this.price = price;
        return this;
    }

    public String getParameter() {
        return parameter;
    }

    public PizzaModel withParameter(String parameter) {
        this.parameter = parameter;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PizzaModel that = (PizzaModel) o;
        return price == that.price &&
                Objects.equals(name, that.name) &&
                Objects.equals(parameter, that.parameter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parameter, price);
    }
}
