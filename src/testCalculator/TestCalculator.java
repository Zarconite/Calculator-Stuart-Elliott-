package testCalculator;

import static org.junit.Assert.*;
import org.junit.Test;
import calculator.Calculator;

public class TestCalculator {

	@Test
    public void InputFiveThreeFifteen() {
		assertEquals("Should return expected results","5*3=15 15/3=5 15/5=3 3*5=15 ", Calculator.input(5,3,15));

    }
	@Test
    public void InputTwoThreeFive() {
		assertEquals("Should return expected results","2+3=5 5-3=2 5-2=3 3+2=5 ", Calculator.input(2,3,5));

    }
	
	@Test
	public void InputFourTwoEight() {
		assertEquals("Should return expected results","4*2=8 8/2=4 8/4=2 2*4=8 ", Calculator.input(4,2,8));

	}	

	@Test
	public void InputSixTwoTwelve() {
		assertEquals("Should return expected results","6*2=12 12/2=6 12/6=2 2*6=12 ", Calculator.input(6,2,12));

    }

	@Test
	public void InputSixTwoThree() {
		assertEquals("Should return expected results","6/2=3 3*2=6 2*3=6 6/3=2 ", Calculator.input(6,2,3));

	}   
	
	@Test
	public void InputNineTwelveOneHundredAndEight() {
		assertEquals("Should return expected results","9*12=108 108/12=9 108/9=12 12*9=108 ", Calculator.input(9,12,108));

	}	
	
	@Test
	public void InputFourSixteenSixtyFour() {
		assertEquals("Should return expected results","4*16=64 64/16=4 64/4=16 16*4=64 ", Calculator.input(4,16,64));

	}	
	
	@Test
	public void InputTwoFourSixThree() {
		assertEquals("Should return expected results","2+4=6 6-4=2 6/3=2 2*3=6 ", Calculator.input(2,4,6,3));

	}	
	
	@Test
	public void InputEightFourThreeSix() {
		assertEquals("Should return nothing","", Calculator.input(8,4,3,6));

	}	
}





	

