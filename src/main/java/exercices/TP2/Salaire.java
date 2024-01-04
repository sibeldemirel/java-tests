package exercices.TP2;

public class Salaire {
    public int tauxHoraire;

    public Salaire(int tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    /** Calcul du salaire normal et avec heures supp (heures min de travail = 151,67)
     * @param heures (int)
     * @return salaireTotal (int)
     */
    public int payer(int heures){
        int heuresNormales = (int) Math.min(heures, 151.67);
        int heuresSupplementaires = (int) Math.max(heures - 151.67, 0);

        // Calcul du salaire pour les heures normales
        int salaireNormal = heuresNormales * tauxHoraire;

        // Calcul du salaire pour les heures supplémentaires à un taux majoré de 25%
        double tauxSupplementaire = 1.25;
        int salaireSupplementaire = (int) (heuresSupplementaires * tauxHoraire * tauxSupplementaire);

        // Calcul du salaire total
        return salaireNormal + salaireSupplementaire;
    }
}
