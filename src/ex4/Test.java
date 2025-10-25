package ex4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre maximum de documents: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        Bibliotheque bibliotheque = new Bibliotheque(n);

       
        bibliotheque.ajouter(new Roman("Le Comte de Monte-Cristo", "Alexandre Dumas", 1200, 20.5));
        bibliotheque.ajouter(new Revue("Science et Vie", "Janvier", 2023));

        while (true) {
            System.out.println("\n=== Menu Bibliothèque ===");
            System.out.println("1. Ajouter un document");
            System.out.println("2. Afficher les documents");
            System.out.println("3. Supprimer un document");
            System.out.println("4. Afficher les auteurs");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option: ");

            int choix = scanner.nextInt();
            scanner.nextLine(); 

            switch (choix) {
                case 1:
                    System.out.println("Type de document à ajouter:");
                    System.out.println("1. Livre");
                    System.out.println("2. Roman");
                    System.out.println("3. Manuel");
                    System.out.println("4. Dictionnaire");
                    System.out.println("5. Revue");
                    System.out.print("Votre choix: ");
                    int type = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Titre: ");
                    String titre = scanner.nextLine();

                    switch (type) {
                        case 1:
                            System.out.print("Auteur: ");
                            String auteur = scanner.nextLine();
                            System.out.print("Nombre de pages: ");
                            int nbrPages = scanner.nextInt();
                            bibliotheque.ajouter(new Livre(titre, auteur, nbrPages));
                            break;
                        case 2:
                            System.out.print("Auteur: ");
                            String auteurR = scanner.nextLine();
                            System.out.print("Nombre de pages: ");
                            int nbrPagesR = scanner.nextInt();
                            System.out.print("Prix: ");
                            double prix = scanner.nextDouble();
                            bibliotheque.ajouter(new Roman(titre, auteurR, nbrPagesR, prix));
                            break;
                        case 3:
                            System.out.print("Auteur: ");
                            String auteurM = scanner.nextLine();
                            System.out.print("Nombre de pages: ");
                            int nbrPagesM = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Niveau: ");
                            String niveau = scanner.nextLine();
                            bibliotheque.ajouter(new Manuel(titre, auteurM, nbrPagesM, niveau));
                            break;
                        case 4:
                            System.out.print("Langue: ");
                            String langue = scanner.nextLine();
                            bibliotheque.ajouter(new Dictionnaire(titre, langue));
                            break;
                        case 5:
                            System.out.print("Mois: ");
                            String mois = scanner.nextLine();
                            System.out.print("Année: ");
                            int annee = scanner.nextInt();
                            bibliotheque.ajouter(new Revue(titre, mois, annee));
                            break;
                        default:
                            System.out.println("Type invalide !");
                    }
                    break;

                case 2:
                    bibliotheque.afficherDocuments();
                    break;

                case 3:
                    System.out.print("Numéro d'enregistrement du document à supprimer: ");
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
                    System.out.println("Auteurs des livres:");
                    bibliotheque.afficherAuteurs();
                    break;

                case 5:
                    System.out.println("Au revoir!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Option invalide.");
            }
        }
    }
}
