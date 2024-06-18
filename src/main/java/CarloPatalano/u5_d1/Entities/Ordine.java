package CarloPatalano.u5_d1.Entities;

import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;

@Component
public class Ordine {
    private int numeroOrdine;
    private String stato;
    private int numeroCoperti;
    private LocalTime oraAcquisizione;
    private Tavolo tavolo;
    private List<Pizza> pizze;
    private List<Drink> drink;
    private double importoTotale;
    private double costoCoperto;

    public Ordine(int numeroOrdine, String stato, int numeroCoperti, Tavolo tavolo, List<Pizza> pizze, List<Drink> drink, double costoCoperto) {
        this.numeroOrdine = numeroOrdine;
        this.stato = stato;
        this.numeroCoperti = numeroCoperti;
        this.tavolo = tavolo;
        this.pizze = pizze;
        this.drink = drink;
        this.costoCoperto = costoCoperto;
        this.oraAcquisizione = LocalTime.now();
        calcolaImportoTotale();
    }

    private void calcolaImportoTotale() {
        importoTotale = numeroCoperti * costoCoperto;
        for (Pizza pizza : pizze) {
            importoTotale += pizza.getPrice();
        }
        for (Drink drinkItem : drink) {
            importoTotale += drinkItem.getPrice();
        }
    }

    public int getNumeroOrdine() {
        return numeroOrdine;
    }

    public void setNumeroOrdine(int numeroOrdine) {
        this.numeroOrdine = numeroOrdine;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public int getNumeroCoperti() {
        return numeroCoperti;
    }

    public void setNumeroCoperti(int numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
    }

    public LocalTime getOraAcquisizione() {
        return oraAcquisizione;
    }

    public void setOraAcquisizione(LocalTime oraAcquisizione) {
        this.oraAcquisizione = oraAcquisizione;
    }

    public Tavolo getTavolo() {
        return tavolo;
    }

    public void setTavolo(Tavolo tavolo) {
        this.tavolo = tavolo;
    }

    public List<Pizza> getPizze() {
        return pizze;
    }

    public void setPizze(List<Pizza> pizze) {
        this.pizze = pizze;
    }

    public List<Drink> getDrink() {
        return drink;
    }

    public void setDrink(List<Drink> drink) {
        this.drink = drink;
    }

    public double getImportoTotale() {
        return importoTotale;
    }

    public void setImportoTotale(double importoTotale) {
        this.importoTotale = importoTotale;
    }

    public double getCostoCoperto() {
        return costoCoperto;
    }

    public void setCostoCoperto(double costoCoperto) {
        this.costoCoperto = costoCoperto;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "numeroOrdine=" + numeroOrdine +
                ", stato='" + stato + '\'' +
                ", numeroCoperti=" + numeroCoperti +
                ", oraAcquisizione=" + oraAcquisizione +
                ", tavolo=" + tavolo +
                ", pizze=" + pizze +
                ", drink=" + drink +
                ", importoTotale=" + importoTotale +
                ", costoCoperto=" + costoCoperto +
                '}';
    }
}