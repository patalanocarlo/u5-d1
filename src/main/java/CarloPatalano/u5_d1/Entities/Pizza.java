package CarloPatalano.u5_d1.Entities;

import java.util.List;

public class Pizza {
    private String name;
    private double price;
    private int calories;
   private List<Toppings> Toppings;


    public Pizza(String name, List<CarloPatalano.u5_d1.Entities.Toppings> toppings, int calories, double price) {
        this.name = name;
        this.Toppings = toppings;
        this.calories = calories;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public List<CarloPatalano.u5_d1.Entities.Toppings> getToppings() {
        return Toppings;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setToppings(List<CarloPatalano.u5_d1.Entities.Toppings> toppings) {
        Toppings = toppings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza" +
                 name + '\'' +
                ", price=" + price +


                '}';
    }
}
