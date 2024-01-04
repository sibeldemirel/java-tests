package exercices.TP2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SalaireTest {

    @ParameterizedTest
    @CsvSource({"10"})
    public void payer( int tauxHoraire){
        Salaire salaire = new Salaire(tauxHoraire);
        double salaireNormal = salaire.payer(140); // 140 heures travaillées
        assertEquals(1400, salaireNormal); // 140 heures * 10 (taux horaire) = 1400 euros

        // Test pour les heures supplémentaires
        double salaireSupplementaire = salaire.payer(160); // 160 heures travaillées
        assertEquals(1622, salaireSupplementaire); // 151.67 heures * 10 + 25% * (160 - 151.67) * 10 = 1622 euros
    }

}