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
    @Test
    public void testEstUnPalindrome(){
        boolean resultat = palindrome.estUnPalindrome(11);
        assertTrue(resultat);
    }

    @Test
    public void testRenverserNombre(){
        boolean resultat = palindrome.estUnPalindrome(132);
        assertFalse(resultat);
    }

    @Test
    public void testVerifierNombre(){
        assertThrows(IllegalArgumentException.class, () -> palindrome.estUnPalindrome(5));
    }
}