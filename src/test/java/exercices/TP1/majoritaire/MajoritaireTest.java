package exercices.TP1.majoritaire;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MajoritaireTest {
    private Majoritaire majoritaire;

    @BeforeEach
    public void myMajoritaire(){
        majoritaire = new Majoritaire();
    }

    @ParameterizedTest
    @CsvSource({"4, 5, 10, 4, 4"})
    public void testHashMap(int val1, int val2, int val3, int val4, int val5){
        int[] monTab = new int[]{val1, val2, val3, val4, val5};
        int result = majoritaire.hashMap(monTab);
        assertEquals(4, result);
    }

    @ParameterizedTest
    @CsvSource({"4, 5, 10, 0, 1"})
    public void testReHashMap(int val1, int val2, int val3, int val4, int val5){
        int[] monTab = new int[]{val1, val2, val3, val4, val5};
        int result = majoritaire.hashMap(monTab);
        assertEquals(0, result);
    }
}