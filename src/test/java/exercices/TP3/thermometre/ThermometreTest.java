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
        int[] tab = new int[0];
        int expected = 0;
        thermometre.give_most_close_to_zero(tab);
        assertEquals(expected, thermometre.give_most_close_to_zero(tab));
    }

    //[1, 2, 3] retourne 1
    @Test
    public void test_if_three_values_table(){
        int[] tab = new int[3];
        int expected = 1;
        thermometre.give_most_close_to_zero(tab);
        assertEquals(expected, thermometre.give_most_close_to_zero(tab));
    }
}