package tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    //Arrange
    Calculator calculator = new Calculator();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Add 2 integers")
    void add(){
        int actual = calculator.add(5,5);
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Substract 2 integers")
    void substract(){
        int actual = calculator.substract(10,5);
        int expected = 5;

        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Multiply 2 integers")
    void multiply(){
        int actual = calculator.multiply(10,5);
        int expected = 50;

        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Divide 2 integers")
    void divide() {
        int actual = calculator.divide(10,5);
        int expected = 2;

        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Overload")
    void testAddString() {
        int actual = calculator.add("1,2,3");
        int expected = 6;

        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Overload")
    void testAddArray() {
        int actual = calculator.add(new int[]{1,2,3});
        int expected = 6;

        assertEquals(actual, expected);
    }

}