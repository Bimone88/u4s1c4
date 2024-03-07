package esercizio1;

public class Dirigente extends Dipendente {
    private double bonus;

    public Dirigente(int matricola, double stipendio, Dipartimento dipartimento, double bonus) {
        super(matricola, stipendio, dipartimento);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getStipendioBase() + bonus; // Stipendio mensile incrementato dal bonus
    }
}

