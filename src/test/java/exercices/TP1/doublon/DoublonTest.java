package exercices.TP1.doublon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DoublonTest {
    private Doublon doublon;

    @BeforeEach
    public void mesDoublons() {doublon = new Doublon();}

    @ParameterizedTest
    @CsvSource({"10, 2, 30, 3, 50"})
    public void testVerifierSiDoublons(int val1, int val2, int val3, int val4, int val5){
        int[] monTab = new int[]{val1, val2, val3, val4, val5};
        boolean result = doublon.verifierSiDoublons(monTab);
        assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource({"10, 2, 30, 2, 50"})
    public void testReVerifierSiDoublons(int val1, int val2, int val3, int val4, int val5){
        int[] monTab = new int[]{val1, val2, val3, val4, val5};
        boolean result = doublon.verifierSiDoublons(monTab);
        assertTrue(result);
    }
}