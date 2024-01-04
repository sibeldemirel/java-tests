package exercices.TP2;

public abstract class Salarie {

    private Salaire salaire;
    private Identite identite;

    public abstract void demenager(Adresse adresse);

    /** fait travailler le salarie un certain nombre d'heures
     * affiche String indiquant le salaire
     * @param heures (int)
     */
    public void travailler(int heures) {
        if (heures <= 0) {
            heures = 151; // Si aucune heure n'est spécifiée, on considère 151.67 heures
        }

        double salaireGagne = salaire.payer(heures);

        System.out.println("Le salarié Jean Dupont a travaillé " + heures + " heures et a perçu " + salaireGagne + " euros");
    }

    public abstract void augmenter(double pourcentage);

}
