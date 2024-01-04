package exercices.TP2;

public abstract class Salarie {

    private Salaire salaire;
    private Identite identite;

    public abstract void demenager(Adresse adresse);

    public void travailler(int heures) {
    }

    public abstract void augmenter(double pourcentage);

}
