package ex4;

import java.util.ArrayList;

public class Bibliotheque {
    private int capacite;
    private ArrayList<Document> documents;

    public Bibliotheque(int capacite) {
        this.capacite = capacite;
        this.documents = new ArrayList<>(capacite);
    }

    public boolean ajouter(Document doc) {
        if (documents.size() < capacite) {
            documents.add(doc);
            return true;
        }
        return false;
    }

    public boolean supprimer(Document doc) {
        return documents.remove(doc);
    }

    public Document document(int numEnrg) {
        for (Document doc : documents) {
            if (doc.getNumEnreg() == numEnrg) {
                return doc;
            }
        }
        return null;
    }

    public void afficherDocuments() {
        for (Document doc : documents) {
            System.out.println(doc);
        }
    }

    public void afficherAuteurs() {
        for (Document doc : documents) {
            if (doc instanceof Livre) {
                System.out.println(((Livre) doc).getAuteur());
            }
        }
    }
}
