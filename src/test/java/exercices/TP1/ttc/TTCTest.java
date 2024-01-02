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
    public void HtToTtc(){
        int prixHt = -5;
        assertThrows(IllegalArgumentException.class, () -> prixTTC.HtToTtc(prixHt));
    }
}