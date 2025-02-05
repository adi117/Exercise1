package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberFeatureTest {

    @Test
    @DisplayName("Sum of Number")
    void testSumofNumber(){
        assertEquals(10, NumberFeature.sumOfNumberList(1234));
    }

    @Test
    @DisplayName("Check Prime Number")
    void testPrimeNumber(){
        assertTrue(NumberFeature.isPrimeNumber(17));
        assertFalse(NumberFeature.isPrimeNumber(4));
    }

    @Test
    @DisplayName("Find the Largest Number")
    void testFindLargestNumber(){
        assertEquals(8, NumberFeature.findLargestNumber(new int[] {3, 7, 2, 8, 1}));
    }

    @Test
    @DisplayName("Simple Calculator")
    void testSimpleCalculator(){
//        assertEquals(8, NumberFeature.calculate("5 + 3"));
        assertEquals(5, NumberFeature.calculate("10 / 2"));
    }

    @Test
    @DisplayName("Fibonacci Sequence")
    void testFibonacciSequence(){
        assertArrayEquals(new int[] {0,1,1,2,3,5}, NumberFeature.fibonacciSequence(6));
    }

    @Test
    @DisplayName("Sorting Number")
    void testSortingNumber(){
        assertArrayEquals(new int[] {11, 12, 22, 25, 34, 64, 90}, NumberFeature.sortingSmalltoLarge(new int[] {64, 34, 25, 12, 22, 11, 90}));
    }

    @Test
    @DisplayName("Find Second Smallest Number")
    void testFindSecondSmallestNumber(){
        assertEquals(2, NumberFeature.findSecondSmallesstNumber(new int[] {5, 3, 8, 1, 2, 9}));
    }

}