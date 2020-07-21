package com;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.MessageService;
@ExtendWith(SpringExtension.class)
@SpringBootTest

public class TestCalculatorService {
	CalculatorService calculatorService = new CalculatorService();
	@Test
	public void testsum() {
		Assertions.assertEquals(30, calculatorService.sum());
	}
	public void testmultiply() {
		Assertions.assertEquals(200,  calculatorService.multiply());
	}
    public void testdivide() {
    	Assertions.assertEquals(2, calculatorService.divide());
    }
    public void testsubtract() {
    	Assertions.assertEquals(10, calculatorService.subtract());
    }
    public void testmath() {
    	Assertions.assertEquals(20>10, calculatorService.math());	
    }
}


