package ex1;


public class CompteEpargne extends Compte {
    private double tauxDeRendement;

    public CompteEpargne(double soldeInitial, double tauxDeRendement) {
        super(soldeInitial);
        this.tauxDeRendement = tauxDeRendement;
    }

    public void appliquerRendement() {
        double rendement = compteSolde * tauxDeRendement / 100.0;
        compteSolde += rendement;
        System.out.println("CompteEpargne #" + getCompteNumero() + " : rendement de " + rendement);
    }

    @Override
    public void afficherDetails() {
        System.out.println("CompteEpargne #" + getCompteNumero() + " — solde = " + compteSolde + ", taux = " + tauxDeRendement + "%");
    }
}
