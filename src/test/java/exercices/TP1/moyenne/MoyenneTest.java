package exercices.TP1.moyenne;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MoyenneTest {
    private Moyenne resultatCalcul;
    @BeforeEach
    public void setUp() {
        resultatCalcul = new Moyenne();
    }

    @ParameterizedTest
    @CsvSource({"12,6,15,11", "17,18,19,18", "10,9,8,9"})
    public void testMoyenne(int note1, int note2, int note3, int expected) {
        int[] notes = new int[]{note1, note2, note3};
        Integer result = resultatCalcul.moyenne(notes);
        assertEquals(expected, result, "Il y a une erreur de calcul");
    }
    @ParameterizedTest
    @CsvSource({"32,6,24", "20,25,30", "15,35,40"})
    public void testNoteIncorrecte(int note1, int note2, int note3){
        int[] notes = new int[]{note1, note2, note3};
        assertThrows(IllegalArgumentException.class,
                () -> resultatCalcul.moyenne(notes));
    }

    @ParameterizedTest
    @CsvSource({"11, 6", "14, 16"})
    public void testNoteNb(int note1, int note2) {
        int[] notes = new int[]{note1, note2};
        assertThrows(IllegalArgumentException.class, () -> resultatCalcul.moyenne(notes));
    }
}