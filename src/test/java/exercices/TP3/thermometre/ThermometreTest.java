package exercices.TP3.thermometre;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThermometreTest {
    private Thermometre thermometre;

    @BeforeEach
    public void setUp(){
        thermometre = new Thermometre();
    }

    @Test
    public void test_if_empty_table(){
        int[] tab = new int[4];
        int[] expected = new int[0];
        assertEquals(expected, tab);
    }
}