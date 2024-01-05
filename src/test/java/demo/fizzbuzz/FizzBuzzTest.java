package demo.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }
    @ParameterizedTest
    @CsvSource({"1,1", "2,2"})
    public void should_return_str_if_no_multiple_of_3_or_5_or_both(int number, String expected){
        String result = fizzBuzz.say(number);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 12})
    public void should_return_fizz_when_3(int number){
        String result = fizzBuzz.say(number);
        assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    public void should_return_buzz_when_10(int number){
        String result = fizzBuzz.say(number);
        assertEquals("Buzz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30})
    public void should_return_fizzbuzz_when_15(int number){
        String result = fizzBuzz.say(number);
        assertEquals("FizzBuzz", result);
    }
}