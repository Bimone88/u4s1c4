package esercizio1;

public class Main {
    public static void main(String[] args) {
        Dipendente[] dipendenti = new Dipendente[]{
                new DipendenteFullTime(1, 2500.0, Dipartimento.PRODUZIONE),
                new DipendentePartTime(2, 15.0, Dipartimento.AMMINISTRAZIONE, 160), // Assumiamo 15 euro/ora e 160 ore lavorate
                new Dirigente(3, 4000.0, Dipartimento.VENDITE, 1000.0) // Assumiamo uno stipendio base di 4000 e un bonus di 1000
        };

        for (Dipendente dipendente : dipendenti) {
            System.out.println("Matricola: " + dipendente.getMatricola() + ", Stipendio: " + dipendente.calculateSalary());
        }
    }
}

