/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package org.swp.fibonacci.core;

import static org.swp.fibonacci.core.FibonacciTestng.getFibonacci;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Admin
 */
public class FibonacciTest {
    
    @Test
    public void testFibonacciGivenRightArgumentRunsWell() {
        assertEquals(getFibonacci(0), 0);
        assertEquals(getFibonacci(1), 1);
        assertEquals(getFibonacci(2), 1);
        assertEquals(getFibonacci(3), 2);
        assertEquals(getFibonacci(4), 3);
        assertEquals(getFibonacci(5), 5);
        assertEquals(getFibonacci(6), 8);
        assertEquals(getFibonacci(7), 13);
        assertEquals(getFibonacci(8), 21);
        assertEquals(getFibonacci(9), 34);
    }
    
}
