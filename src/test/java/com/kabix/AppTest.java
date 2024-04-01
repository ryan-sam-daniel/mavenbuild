package com.kabix;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */

    @Test
    public void testAddition() {

        assertEquals(15, App.addition(10, 5));
        assertEquals(0, App.addition(0, 0));
        assertEquals(-5, App.addition(10, -15));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, App.subtraction(10, 5));
        assertEquals(0, App.subtraction(0, 0));
        assertEquals(25, App.subtraction(10, -15));
    }

    @Test
    public void testMultiplication() {
        assertEquals(50, App.multiplication(10, 5));
        assertEquals(0, App.multiplication(0, 0));
        assertEquals(-150, App.multiplication(10, -15));
    }

    // @Test
    // public void testDivision() {
    // assertEquals(2.0, App.division(10, 5), 0.001);
    // assertEquals(Double.POSITIVE_INFINITY, App.division(10, 0), 0.001);
    // assertEquals(-0.666, App.division(10, -15), 0.001);
    // }

    // @Test
    // public void testModulus() {
    // assertEquals(0, App.modulus(10, 5));
    // assertEquals(0, App.modulus(0, 1));
    // assertEquals(10, App.modulus(10, 10));
    // assertEquals(-5, App.modulus(10, -15));
    // }
}
