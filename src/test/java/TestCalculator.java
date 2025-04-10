import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; // Correct JUnit 5 annotation

public class TestCalculator {

    @BeforeAll
    public static void init() {
        System.out.println("Initializing TestCalculator");
    }


    @BeforeEach
    void setup(){
        System.out.println("Test setup");
        Calculator calc = new Calculator();
    }

    @AfterEach
    void teardown(){
        System.out.println("Test teardown");
        Calculator calc = new Calculator();
    }
    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(3, calc.add(1, 2)); // Replace 3 with the expected result
    }

    @Test
    void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.subtraction(3, 2)); // Replace 3 with the expected result
    }

    @Test
    void testMultiplication() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiplication(3, 2)); // Replace 3 with the expected result

    }

    @Test
    void testDivision() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.division(6, 3));

    }

    @Test
    void testDivisionByZero() {
        Calculator calc = new Calculator();
        //assertEquals(0,calc.division(6, 0));
        System.out.println(
                assertThrows(ArithmeticException.class,()-> calc.division(10,0)));
    }
}
