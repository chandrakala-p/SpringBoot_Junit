package com.gl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import com.gl.logic.Calculator;

@SpringBootTest
class SpringJUnitApplicationTests {

	 private Calculator calculator = new Calculator();

	    @Test
	    void addition() {
	        assertEquals(2, calculator.add(1, 1));
	    }
	    
	    @Test
	    void subtraction() {
	        assertEquals(0, calculator.sub(1, 1));
	    }
	    
	    @Test
	    void multi() {
	        assertEquals(1, calculator.mul(1, 1));
	    }
	    
	    @Test
	    void division() {
	        assertEquals(1, calculator.divide(1, 1));
	    }
	    
	    @ParameterizedTest
	    @ValueSource(ints = {1,3,6,-5,8, Integer.MAX_VALUE})
	    void TestforOddNumbers(int num)
	    {
	    	assertTrue(calculator.isOdd(num));
	    }

}
