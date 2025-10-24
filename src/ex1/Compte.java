package ex1;

public class Compte {
    private static int compteCount = 0;
    private final int compteNumero;
    protected double compteSolde;

    public Compte(double soldeInitial) {
        this.compteNumero = ++compteCount;
        this.compteSolde = soldeInitial;
    }

    public int getCompteNumero() {
        return compteNumero;
    }

    public double getCompteSolde() {
        return compteSolde;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            compteSolde += montant;
            System.out.println("Compte #" + compteNumero + " : dépôt de " + montant);
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && compteSolde >= montant) {
            compteSolde -= montant;
            System.out.println("Compte #" + compteNumero + " : retrait de " + montant);
        } else {
            System.out.println("Compte #" + compteNumero + " : retrait impossible (solde insuffisant)");
        }
    }

    public void afficherDetails() {
        System.out.println("Compte #" + compteNumero + " — solde = " + compteSolde);
    }
}

