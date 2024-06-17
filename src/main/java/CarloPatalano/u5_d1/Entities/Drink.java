package CarloPatalano.u5_d1.Entities;

public class Drink {
    private String name;
    private double price;
    private int calories;
private  String capacity;

    public Drink(String name, int calories, double price , String capacity) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.capacity=capacity;
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

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
