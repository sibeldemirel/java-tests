package exercices.TP1.palindrome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    private Palindrome palindrome;

    @BeforeEach
    public void mesPalindromes(){
        palindrome = new Palindrome();
    }
/*    @ParameterizedTest
    @CsvSource({"101"})*/
    @ParameterizedTest
    @CsvSource({"11"})
    public void testEstUnPalindrome(int nb){
        boolean resultat = palindrome.estUnPalindrome(nb);
        assertTrue(resultat);
    }

    @ParameterizedTest
    @CsvSource({"132"})
    public void testRenverserNombre(int nb){
        boolean resultat = palindrome.estUnPalindrome(nb);
        assertFalse(resultat);
    }

    @ParameterizedTest
    @CsvSource({"5"})
    public void testVerifierNombre(int nb){
        assertThrows(IllegalArgumentException.class, () -> palindrome.estUnPalindrome(nb));
    }
}