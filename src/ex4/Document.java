package ex4;

public class Document {
    protected static int numEnregCounter = 0;  // Auto-increment for numEnreg
    protected int numEnreg;
    protected String titre;

    public Document(String titre) {
        this.numEnreg = ++numEnregCounter; // auto-increment
        this.titre = titre;
    }

    public int getNumEnreg() {
        return numEnreg;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return "Document{" +
               "numEnreg=" + numEnreg +
               ", titre='" + titre + '\'' +
               '}';
    }
}
