/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzzapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author root
 */
public class FizzBuzzTest {
    
    public FizzBuzzTest() {
    }

    @Test
    public void process_processingSingleNumber_returnNumberOrString() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        
        String result = fizzBuzz.process(1); 
        assertEquals("1", result);
        
        result = fizzBuzz.process(2);
        assertEquals("2", result);
        
        
        result = fizzBuzz.process(3);
        assertEquals("Fizz", result);
        
        result = fizzBuzz.process(4);
        assertEquals("4", result);

        
        result = fizzBuzz.process(5);
        assertEquals("Buzz", result);
        
        result = fizzBuzz.process(6);
        assertEquals("Fizz", result);
        
        result = fizzBuzz.process(10);
        assertEquals("Buzz", result);
        
        result = fizzBuzz.process(15);
        assertEquals("FizzBuzz", result);
        
    }
    
}
