package CarloPatalano.u5_d1.Entities;

import java.util.List;

public class PizzeXL extends Pizza {
    private String Size;

    public PizzeXL(String name, double price, int calories, List<Toppings> toppings) {
        super(name, toppings, calories, price);
        this.Size="Xl";
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }
}
