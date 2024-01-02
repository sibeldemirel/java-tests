package exercices.TP1.moyenne;

import exercices.TP1.moyenne.Moyenne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoyenneTest {
    private Moyenne resultatCalcul;
    @BeforeEach
    public void mesMoyennes(){
        resultatCalcul = new Moyenne();
    }

    @Test
    public void testMoyenne() {
        int[] notes = new int[]{12, 6, 15};
        Integer result = resultatCalcul.moyenne(notes);
        assertEquals(11, result, "il y a une erreur de calcul");
    }
    @Test
    public void testNoteInccorecte(){
        int[] notes = new int[]{32, 6, 24};
        assertThrows(IllegalArgumentException.class, () -> resultatCalcul.moyenne(notes));
    }

    @Test
    public void testNoteNb() {
        int[] notes = new int[]{11, 6};
        assertThrows(IllegalArgumentException.class, () -> resultatCalcul.moyenne(notes));
    }
}