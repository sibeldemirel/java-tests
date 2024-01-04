package exercices.TP2;

public class Salaire {
    public double tauxHoraire;

    public Salaire(int tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    /** Calcul du salaire normal et avec heures supp (heures min de travail = 151,67)
     * @param heures (int)
     * @return salaireTotal (int)
     */
    public double payer(double heures){
        double heuresNormales = (int) Math.min(heures, 151.67);
        double heuresSupplementaires = (int) Math.max(heures - heuresNormales, 0);

        double salaireNormal = heuresNormales * tauxHoraire;

        double tauxSupplementaire = 1.25;
        int salaireSupplementaire = (int) (heuresSupplementaires * tauxHoraire * tauxSupplementaire);

        return salaireNormal + salaireSupplementaire;
    }
}
