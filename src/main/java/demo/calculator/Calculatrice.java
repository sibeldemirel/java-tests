package demo.calculator;

public class Calculatrice {

    /**
     * Retourne la somme de deux nombres
     * @param premierNombre le premier nombre
     * @param secondNombre le second nombre
     * @return la somme des deux nombres
     */
    public float additionner(float premierNombre, float secondNombre) {
        return premierNombre + secondNombre;
    }

    /**
     * Retourne la différence entre deux nombres
     * @param premierNombre le premier nombre
     * @param secondNombre le nombre à soustraire au premier
     * @return la différence entre les deux nombres
     */
    public float soustraire(float premierNombre, float secondNombre) {
        return premierNombre - secondNombre;
    }

    /**
     * Retourne le produit de deux nombres
     * @param premierNombre le premier nombre
     * @param secondNombre le second nombre
     * @return le produit des deux
     */
    public float multiplier(float premierNombre, float secondNombre) {
        return premierNombre * secondNombre;
    }

    /**
     * Retourne le quotient de deux nombres
     * @param premierNombre le premier nombre
     * @param secondNombre le second nombre
     * @return le quotient des deux nombres
     */
    public float diviser(float premierNombre, float secondNombre) throws IllegalArgumentException {
        if (secondNombre == 0) {
            throw new IllegalArgumentException("La division par zéro est impossible !");
        }
        return premierNombre / secondNombre;
    }

}
