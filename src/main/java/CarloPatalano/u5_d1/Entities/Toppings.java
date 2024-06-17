package CarloPatalano.u5_d1.Entities;

public class Toppings {
    private String name;
    private double price;
    private int calories;

    public Toppings(int calories, double price, String name) {
        this.calories = calories;
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " Price: " + price + ", Calories: " + calories  ;
    }
}
