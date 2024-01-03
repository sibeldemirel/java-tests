package exercices.TP1.romain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanToNumberTest {
    private RomanToNumber romanNumber;

    @BeforeEach
    public void myRoman() {
        romanNumber = new RomanToNumber();
    }

    @ParameterizedTest
    @CsvSource({"205, CCV", "4, IV"})
    public void testConvertirNombreRomainEnNombreArabe(int nombreArabe, String nombreRomain){
        int result = romanNumber.convertirNombreRomainEnNombreArabe(nombreRomain);
        assertEquals(nombreArabe, result);
    }
}