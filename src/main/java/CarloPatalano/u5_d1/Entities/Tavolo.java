package CarloPatalano.u5_d1.Entities;

import org.springframework.stereotype.Component;

@Component
public class Tavolo {
    private int numero;
    private int numeroCopertiMax;
    private String stato;

    public Tavolo(int numero, int numeroCopertiMax) {
        this.numero = numero;
        this.numeroCopertiMax = numeroCopertiMax;
        this.stato = "Occupato";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumeroCopertiMax() {
        return numeroCopertiMax;
    }

    public void setNumeroCopertiMax(int numeroCopertiMax) {
        this.numeroCopertiMax = numeroCopertiMax;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numero=" + numero +
                ", numeroCopertiMax=" + numeroCopertiMax +
                ", stato='" + stato + '\'' +
                '}';
    }
}