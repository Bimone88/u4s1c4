package esercizio1;

public class DipendentePartTime extends Dipendente {
    private int oreLavorate;
    private double tariffaOraria;

    public DipendentePartTime(int matricola, double tariffaOraria, Dipartimento dipartimento, int oreLavorate) {
        super(matricola, 0, dipartimento);
        this.tariffaOraria = tariffaOraria;
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {
        return oreLavorate * tariffaOraria;
    }
}

