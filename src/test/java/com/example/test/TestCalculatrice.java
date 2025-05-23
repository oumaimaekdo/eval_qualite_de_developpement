package com.example.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculatrice {
    private Calculatrice calc;

    @BeforeEach
    public void init() {
        this.calc = new Calculatrice();
    }

    @Test
    public void whenAddingFourAndSix_ShouldReturnTen() {
        assertEquals(10, calc.add(4, 6));
    }

    @Test
    public void whenDividingFortyByTwo_ShouldReturnTwenty() {
        assertEquals(20, this.calc.div(40, 2));
    }

    @Test
    public void whenDividingByZero_ShouldThrowException() {
        assertThrows(ArithmeticException.class, () -> calc.div(5, 0));
    }
    @Test
    public void whenMultiplyingMinusThreeAndFour_ShouldReturnMinusTwelve() {
        assertEquals(-12, this.calc.mult(-3, 4));
    }

    @Test
    public void whenSubtractingFiveFromThree_ShouldReturnMinusTwo() {
        assertEquals(-2, this.calc.minus(3, 5));
    }
}