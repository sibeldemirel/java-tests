package exercices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoyenneTest {
    @Test
    public void testMoyenne() {
        int[] notes = new int[]{12, 6, 15};
        Moyenne resultatCalcul = new Moyenne();
        Integer result = resultatCalcul.moyenne(notes);
        assertEquals(11, result, "il y a une erreur de calcul");
    }
}