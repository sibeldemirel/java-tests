package exercices.TP2;

public abstract class Salarie {
    public Salaire getSalaire() {
        return salaire;
    }

    public void setSalaire(Salaire salaire) {
        this.salaire = salaire;
    }

    public Identite getIdentite() {
        return identite;
    }

    public void setIdentite(Identite identite) {
        this.identite = identite;
    }

    private Salaire salaire;
    private Identite identite;

    public Salarie(Salaire salaire, Identite identite) {
        this.salaire = salaire;
        this.identite = identite;
    }

    public void demenager(Adresse adresse){
        identite.setAdresse(adresse);
    }

    /**
     * fait travailler le salarie un certain nombre d'heures
     * affiche String indiquant le salaire
     *
     * @param heures (int)
     * @return
     */
    public double travailler(double heures) {
        if (heures <= 0) {
            heures = 151;
        }

        double salaireGagne = salaire.payer(heures);

        System.out.println("Le salarié Jean Dupont a travaillé " + heures + " heures et a perçu " + salaireGagne + " euros");
        return salaireGagne;
    }

    public void augmenter(double pourcentage){
        double salaireAugmente = salaire.tauxHoraire * pourcentage/100;
        salaire.tauxHoraire = salaire.tauxHoraire + salaireAugmente;
    }
}
