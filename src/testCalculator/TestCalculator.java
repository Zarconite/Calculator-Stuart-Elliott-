package testCalculator;

import static org.junit.Assert.*;
import org.junit.Test;
import calculator.Calculator;

public class TestCalculator {

	@Test
    public void Inputfivethreefifteen() {
		assertEquals("Should return expected results","5*3=15 15/3=5 15/5=3 3*5=15 ", Calculator.inputNumbers(5,3,15));

    }
	@Test
    public void Inputtwothreefive() {
		assertEquals("Should return expected results","2+3=5 5-3=2 5-2=3 3+2=5 ", Calculator.inputNumbers(2,3,5));

    }
	/*
	@Test
    public void FactorialsTrue1() {
		assertEquals("Should return ",15, Calculator.inputNumbers(5,3,15));

    }
	@Test
    public void FactorialsTrue1() {
		assertEquals("Should return ",15, Calculator.inputNumbers(5,3,15));

    }*/
	
}





	

