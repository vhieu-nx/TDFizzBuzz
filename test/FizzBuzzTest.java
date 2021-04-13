import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    @DisplayName("case 3")
    void testFizzBuzz3(){
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 5")
    void testFizzBuzz5(){
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 15")
    void testFizzBuzz15(){
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 233")
    void testFizzBuzz233(){
        int number = 233;
        String expected = "Fizz";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 517")
    void testFizzBuzz517(){
        int number = 517;
        String expected = "Buzz";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected,result);
    }
}