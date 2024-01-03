package exercices.TP1.ttc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TTCTest {
    private TTC prixTTC;
    @BeforeEach
    public void mesPrix(){
        prixTTC = new TTC();
    }
    @ParameterizedTest
    @CsvSource({"-5"})
    public void testHtToTtc(int price){
        assertThrows(IllegalArgumentException.class, () -> prixTTC.HtToTtc(price));
    }

    @ParameterizedTest
    @CsvSource({
            "20 , 24.0",
            "0  , 0.0",
            "100, 120"
    })
    public void testAjouterTva(int price, float expected) {
        assertEquals(expected, prixTTC.HtToTtc(price));
    }
}