package exercices;

import exercices.TP1.moyenne.Moyenne;
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
    @Test
    public void testNoteInccorecte(){
        int[] notes = new int[]{32, 6, 24};
        Moyenne resultatCalcul = new Moyenne();
        assertThrows(IllegalArgumentException.class, () -> resultatCalcul.moyenne(notes));
    }

    @Test
    public void testNoteNb() {
        int[] notes = new int[]{11, 6};
        Moyenne resultatCalcul = new Moyenne();
        assertThrows(IllegalArgumentException.class, () -> resultatCalcul.moyenne(notes));
    }
}