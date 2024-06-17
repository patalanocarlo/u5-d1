package CarloPatalano.u5_d1.Entities;

import java.util.List;

public class Menù {
    private List<Pizza> pizzas;
    private List<Drink> drinks;
private  List<Toppings> toppings;
    public Menù(List<Drink> drinks, List<Pizza> pizzas,List<Toppings> toppings ) {
        this.drinks = drinks;
        this.pizzas = pizzas;
        this.toppings=toppings;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }
}
