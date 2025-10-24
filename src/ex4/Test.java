package ex4;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de documents: ");
        int n = scanner.nextInt();
        Bibliotheque bibliotheque = new Bibliotheque(n);

        
        bibliotheque.ajouter(new Roman("Le Comte de Monte-Cristo", "Alexandre Dumas", 1200, 20.5));
        bibliotheque.ajouter(new Revue("Science et Vie", "Janvier", 2023));

       
        while (true) {
            System.out.println("1. Ajouter un document");
            System.out.println("2. Afficher les documents");
            System.out.println("3. Supprimer un document");
            System.out.println("4. Afficher les auteurs");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option: ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Entrez le titre du document: ");
                    String titre = scanner.next();
                    System.out.print("Entrez l'auteur: ");
                    String auteur = scanner.next();
                    System.out.print("Entrez le nombre de pages: ");
                    int nbrPages = scanner.nextInt();
                    bibliotheque.ajouter(new Livre(titre, auteur, nbrPages));
                    break;
                case 2:
                    bibliotheque.afficherDocuments();
                    break;
                case 3:
                    System.out.print("Entrez le numéro d'enregistrement du document à supprimer: ");
                    int numEnrg = scanner.nextInt();
                    Document doc = bibliotheque.document(numEnrg);
                    if (doc != null) {
                        bibliotheque.supprimer(doc);
                        System.out.println("Document supprimé.");
                    } else {
                        System.out.println("Document non trouvé.");
                    }
                    break;
                case 4:
                    bibliotheque.afficherAuteurs();
                    break;
                case 5:
                    System.out.println("Au revoir!");
                    return;
                default:
                    System.out.println("Option invalide.");
            }
        }
    }
}
