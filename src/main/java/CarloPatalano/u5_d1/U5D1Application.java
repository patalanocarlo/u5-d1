package CarloPatalano.u5_d1;

import CarloPatalano.u5_d1.Entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class U5D1Application {
	public static void main(String[] args) {
		SpringApplication.run(U5D1Application.class, args);
	}

	@Autowired
	private Menù menù;

	@Value("${costo.coperto}")
	private double costoCoperto;

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			List<PizzeXL> xlPizzas = (List<PizzeXL>) ctx.getBean("xlPizzas");
			System.out.println("Il menù Clienti:");
			menù.getPizzas().forEach(pizza -> {
				System.out.println("Pizza:" + pizza.getName()+ " " + " Toppings:" +pizza.getToppings() + " " + "Calorie:"+ " " + pizza.getCalories()+ " " + "Prezzo:" + " " + pizza.getPrice() );

			});
			System.out.println("Lista Toppings singoli:");
			menù.getToppings().forEach(toppings -> {
				System.out.println("Toppings:" +toppings.getName() + " " + "Prezzo:" + toppings.getPrice() + " " + "Calorie:" + toppings.getCalories());

			});
			System.out.println("Pizze XL disponibili:");
			xlPizzas.forEach(pizzeXL -> {
				System.out.println("Pizza XL:" + pizzeXL.getName()+ " " + "Prezzo:" + pizzeXL.getPrice() + " Toppings:" + pizzeXL.getToppings() + "" + "Size:" + pizzeXL.getSize() + " " + " Calorie:"+ pizzeXL.getCalories());
			});
			menù.getDrinks().forEach(drink -> {
				System.out.println("Drink:" + drink.getName() + " " + "Capacity:" + drink.getCapacity()+ " " + "Prezzo:" + drink.getPrice() + " "+ "Calorie:" + drink.getCalories());
			});
			Ordine ordine = ctx.getBean(Ordine.class);
			System.out.println("Ordine creato con successo: " + ordine);

		};
	}






	@Bean
	public Tavolo tavolo() {
		return new Tavolo(1, 4);
	}
	@Bean
	public Tavolo tavolo2() {
		return new Tavolo(3, 4);
	}
	@Bean

	public Ordine ordine(Tavolo tavolo, Menù menù) {
		List<Pizza> pizzeOrdinate = Arrays.asList(menù.getPizzas().get(0));
		List<Drink> drinksOrdinati = Arrays.asList(menù.getDrinks().get(0));

		return new Ordine(1, "In corso", 4, tavolo, pizzeOrdinate, drinksOrdinati, costoCoperto);
	}
	@Bean
	@Primary
	public Ordine ordine1(Tavolo tavolo2,Menù menù){
		List<Pizza> pizzeOrdinate2 = Arrays.asList(menù.getPizzas().get(1));
		List<Drink> drinksOrdinati2= Arrays.asList(menù.getDrinks().get(1));
		return new Ordine(3,"Consegnato",2,tavolo2,pizzeOrdinate2,drinksOrdinati2,costoCoperto);
	}

}