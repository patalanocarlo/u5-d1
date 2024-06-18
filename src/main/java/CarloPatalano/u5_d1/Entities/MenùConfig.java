package CarloPatalano.u5_d1.Entities;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.Arrays;
import java.util.List;

@Configuration
public class MenùConfig {

@Bean
public Pizza margherita(){
    return new Pizza("Margherita", Arrays.asList(cheese(),Tomato()),1120,5.99);
}
@Bean
public Pizza pizzaConAnanas(){
    return new Pizza("Hawaii Pizza",Arrays.asList(ham(), cheese(),pineApple()),2000,12.00);
}



    @Bean
    public  Toppings cheese(){
        return new Toppings(100,1.20,"Formaggio");
    }


    @Bean
    public Toppings ham(){
        return new Toppings(210,0.90,"Prosciutto");
    }

    @Bean
public Toppings pineApple(){
        return new Toppings(80,2.30,"Ananas");
    }
    @Bean
    public Toppings Tomato(){
    return new Toppings(20,0.30,"Pomodoro");
    }
    @Bean
    public PizzeXL margheritaXL() {
        return new PizzeXL("Margherita XL", 8.0, 1800, Arrays.asList(cheese(),Tomato()));
    }
    @Bean
    public PizzeXL margheritaConProsciuttoXL() {
        return new PizzeXL("Margherita XL", 8.0, 800, Arrays.asList(cheese(),ham(),Tomato()));
    }

    @Bean
    public Drink CocaCola(){
    return new Drink("CocaCola",300,1.99, "0.33 cl");
    }
    @Bean
    public Drink Water(){
        return new Drink("Acqua",0,0.99,"0.33 cl");
    }
    @Bean
    public Drink Fanta(){
        return new Drink("Aranciata",240,1.99 ,"0.33 cl" );
    }
    @Bean
    public List<PizzeXL> xlPizzas() {
        return Arrays.asList(margheritaXL(), margheritaConProsciuttoXL());
    }
@Bean
    public Menù menu(){
        List<Pizza> pizzas = Arrays.asList(margherita(), pizzaConAnanas());
        List<Drink> drinks= Arrays.asList(CocaCola(),Water(),Fanta());
    List<Toppings>toppings= Arrays.asList(ham(),cheese(),pineApple(),Tomato());
        return new Menù(drinks, pizzas ,toppings );
    }
}
