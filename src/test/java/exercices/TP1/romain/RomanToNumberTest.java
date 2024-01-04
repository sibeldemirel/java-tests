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
    //ci-dessous je crée 2 lots de valeurs que je vais tester
    @CsvSource(
            {
                    "205, CCV",
                    "4, IV"
            })
    //dans les params je leur donne un identifiant (chaque ligne = 1 nbArabe et 1 nbRomain)
    public void testConvertirNombreRomainEnNombreArabe(int nombreArabe, String nombreRomain){
        int result = romanNumber.convertirNombreRomainEnNombreArabe(nombreRomain);
        assertEquals(nombreArabe, result);
    }
}