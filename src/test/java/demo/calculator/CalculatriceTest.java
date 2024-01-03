package demo.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatriceTest {

    private Calculatrice calculatrice;

    private float premierNombre;
    private float secondNombre;

    @BeforeEach
    public void setUp() {
        calculatrice = new Calculatrice();
    }

    @AfterEach
    public void tearDown() {
        premierNombre = 0;
        secondNombre = 0;
    }

    // Exemple avec un CSV Source



    // Données au format CSV
    @CsvSource({
            "1, 1, 2",
            "2, 3, 5",
            "100, 1000, 1100"
    })
    @DisplayName("Test des additions")
    // On peut ajouter les valeurs au nom du test (optionnel)
    @ParameterizedTest(name = "Test {index} : {0} + {1} = {2}")
    // Il faut les passer (dans l'ordre) en paramètre de la méthode de test
    public void testAdditions(
            float premierNombre, // Représente l'index 0
            float secondNombre, // Représente l'index 1
            float expected // Représente l'index 0 2
    ) {
        // Act
        float result = calculatrice.additionner(premierNombre, secondNombre);

        // Assert
        assertEquals(expected, result);
    }

    // Exemple de test paramétrée avec les value source
    @ParameterizedTest(name = "Test {index} : {0} - {0} = 0")
    @DisplayName("Test des soustractions")
    @ValueSource(ints = {1, 2, 3, 4})
    public void testSoustraction(int nombre) {
        // Act
        float result = calculatrice.soustraire(nombre, nombre);

        // Assert
        // NB : tous les résultats doivent être les mêmes !!
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Test des multiplications")
    public void testMultiplier() {
        premierNombre = 3;
        secondNombre = 6;

        float result = calculatrice.multiplier(premierNombre, secondNombre);

        assertEquals(18, result);
    }

    @Test
    @DisplayName("Test des divisions")
    public void testDiviser() {
        premierNombre = 10;
        secondNombre = 2;

        float result = calculatrice.diviser(premierNombre, secondNombre);

        assertEquals(5, result);
    }

    @DisplayName("Division par zero")
    @ParameterizedTest(name = "Test {index} : {0} / 0")
    @ValueSource(floats = {1, 50, 100, 1000})
    public void testDivisionParZero(float premierNombre) {

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculatrice.diviser(premierNombre, 0)
        );

        // Test du message (à éviter)
        assertEquals("La division par zéro est impossible !", exception.getMessage());

        // test de la classe
        assertEquals(IllegalArgumentException.class, exception.getClass());

        // À préférer :
        assertThrows(IllegalArgumentException.class, () -> calculatrice.diviser(premierNombre, 0));
    }

}