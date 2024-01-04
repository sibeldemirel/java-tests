package exercices.TP2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SalaireTest {

    @ParameterizedTest
    @CsvSource({"10"})
    public void payer( int tauxHoraire){
        Salaire salaire = new Salaire(tauxHoraire);
        double salaireNormal = salaire.payer(140);
        assertEquals(1400, salaireNormal);

        double salaireSupplementaire = salaire.payer(160);
        assertEquals(1622, salaireSupplementaire);
    }

}