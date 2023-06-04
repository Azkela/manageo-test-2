package com.example.manageotest2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testFizz() {
        assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", fizzBuzz.fizzBuzz(6));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", fizzBuzz.fizzBuzz(10));
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(30));
    }

    @Test
    public void testNumber() {
        assertEquals("1", fizzBuzz.fizzBuzz(1));
        assertEquals("2", fizzBuzz.fizzBuzz(2));
        assertEquals("4", fizzBuzz.fizzBuzz(4));
    }
}