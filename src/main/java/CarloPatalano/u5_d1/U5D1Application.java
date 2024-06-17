package CarloPatalano.u5_d1;

import CarloPatalano.u5_d1.Entities.Menù;
import CarloPatalano.u5_d1.Entities.Toppings;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class U5D1Application {
	public static void main(String[] args) {
		SpringApplication.run(U5D1Application.class, args);
	}

@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			Menù menù=(Menù) ctx.getBean("menu");
			System.out.println("Il menù Clienti:");
			menù.getPizzas().forEach(pizza -> {
				System.out.println("Pizza:" + pizza.getName() + " " + "Calorie:"+ " " + pizza.getCalories()+ " " + "Prezzo:" + " " + pizza.getPrice() );
				pizza.getToppings().forEach(toppings -> {
					System.out.println("Toppings:" +toppings.getName()+ " " + "Prezzo" + toppings.getPrice()+ " " + "Calorie:" + " " + toppings.getCalories());
				});
			});
			System.out.println("Lista Toppings singoli:");
			menù.getToppings().forEach(toppings -> {
				System.out.println("Toppings:" +toppings.getName() + " " + "Prezzo:" + toppings.getCalories() + " " + "Calorie:" + toppings.getCalories());
			});

			menù.getDrinks().forEach(drink -> {
				System.out.println("Drink:" + drink.getName() + " " + "Capacity:" + drink.getCapacity()+ " " + "Prezzo:" + drink.getPrice() + " "+ "Calorie:" + drink.getCalories());
			});
		};
	}


}
