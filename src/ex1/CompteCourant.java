package ex1;
public class CompteCourant extends Compte {
    private double limiteDecouvert;

    public CompteCourant(double soldeInitial, double limiteDecouvert) {
        super(soldeInitial);
        this.limiteDecouvert = limiteDecouvert;
    }

    @Override
    public void retirer(double montant) {
        if (montant > 0 && compteSolde + limiteDecouvert >= montant) {
            compteSolde -= montant;
            System.out.println("CompteCourant #" + getCompteNumero() + " : retrait de " + montant);
        } else {
            System.out.println("CompteCourant #" + getCompteNumero() + " : retrait impossible (découvert max dépassé)");
        }
    }

    @Override
    public void afficherDetails() {
        System.out.println("CompteCourant #" + getCompteNumero() + " — solde = " + compteSolde + ", découvert autorisé = " + limiteDecouvert);
    }
}
