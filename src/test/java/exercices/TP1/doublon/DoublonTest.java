package exercices.TP1.doublon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublonTest {
    private Doublon doublon;

    @BeforeEach
    public void mesDoublons() {doublon = new Doublon();}

    @Test
    public void testVerifierSiDoublons(){
        int[] monTab = new int[5];
        monTab[0] = 10;
        monTab[1] = 2;
        monTab[2] = 30;
        monTab[3] = 3;
        monTab[4] = 50;
        boolean result = doublon.verifierSiDoublons(monTab);
        assertFalse(result);
    }
}