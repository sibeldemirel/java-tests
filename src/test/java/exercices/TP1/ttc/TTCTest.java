package exercices.TP1.ttc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TTCTest {
    private TTC prixTTC;
    @BeforeEach
    public void mesPrix(){
        prixTTC = new TTC();
    }
    @Test
    public void testHtToTtc(){
        int prixHt = -5;
        assertThrows(IllegalArgumentException.class, () -> prixTTC.HtToTtc(prixHt));
    }

    @Test
    public void testAjouterTva() {
        assertEquals(24.0, prixTTC.ajouterTva(20));
        assertEquals(0.0, prixTTC.ajouterTva(0));
        assertEquals(120.0, prixTTC.ajouterTva(100));
    }

    @Test
    public void testVerifierPrix() {
        assertDoesNotThrow(() -> prixTTC.verifierPrix(20));
        assertThrows(IllegalArgumentException.class, () -> prixTTC.verifierPrix(-10));
        assertDoesNotThrow(() -> prixTTC.verifierPrix(0));
    }
}