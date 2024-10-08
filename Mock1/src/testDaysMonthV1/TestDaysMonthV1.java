package testDaysMonthV1;

import static org.junit.Assert.*;
import org.junit.Test;

import daysmonthV1.*;

public class TestDaysMonthV1 {
	
	// Add your answer to the four test cases for Q1
	@Test
	public void testQ1_1(){
		LeapYearV1 leapYearV1 = new LeapYearV1();
		DaysNuminMonthV1 daysNuminMonthV1 = new DaysNuminMonthV1(leapYearV1);
		int result = daysNuminMonthV1.getDaysNuminMonth(3, 0);
		assertEquals(-1, result);
	}
	
	@Test
	public void testQ1_2(){
		LeapYearV1 leapYearV1 = new LeapYearV1();
		DaysNuminMonthV1 daysNuminMonthV1 = new DaysNuminMonthV1(leapYearV1);
		int result = daysNuminMonthV1.getDaysNuminMonth(5, 2);
		assertEquals(31, result);
	}
	
	@Test
	public void testQ1_3(){
		LeapYearV1 leapYearV1 = new LeapYearV1();
		DaysNuminMonthV1 daysNuminMonthV1 = new DaysNuminMonthV1(leapYearV1);
		int result = daysNuminMonthV1.getDaysNuminMonth(6, 4);
		assertEquals(30, result);
	}
	
	@Test
	public void testQ1_4(){
		LeapYearV1 leapYearV1 = new LeapYearV1();
		DaysNuminMonthV1 daysNuminMonthV1 = new DaysNuminMonthV1(leapYearV1);
		int result = daysNuminMonthV1.getDaysNuminMonth(20, 7);
		assertEquals(-2, result);
	}
	
	// Add your answer to the two test cases for Q2
	@Test
	public void testQ2_1(){
		
       // Removed by Student 1
		
		class StubLeapYearV2 extends LeapYearV1 {
			
			public boolean isLeapYear(int year){
				return true;
			}
		}
		
		//StubLeapYearV1 stubLeapYearV1 = new StubLeapYearV1();
		LeapYearV1 stub_v2 = new StubLeapYearV2(); 
		
		DaysNuminMonthV1 daysNuminMonthV1 = new DaysNuminMonthV1(stub_v2);
		int result = daysNuminMonthV1.getDaysNuminMonth(2, 2084);
		assertEquals(29, result);
	}
	
	@Test
	public void testQ2_2(){

		
		// Removed by Student 2
		
		// Added a few lines here ...
		
		class StubLeapYearV2 extends LeapYearV1 {
			public boolean isLeapYear(int year){
				return false;
			}
		}
		
		//StubLeapYearV1 stubLeapYearV1 = new StubLeapYearV1();
		LeapYearV1 stub_v2 = new StubLeapYearV2(); 
		DaysNuminMonthV1 daysNuminMonthV1 = new DaysNuminMonthV1(stub_v2);
		int result = daysNuminMonthV1.getDaysNuminMonth(2, 2084);
		assertEquals(28, result);
	}

	
	
	// Add your answer to the two test cases for Q3
	@Test
	public void testQ3_1(){
		LeapYearV1 leapYearV1 = new LeapYearV1();
		DaysNuminMonthV1 daysNuminMonthV1 = new DaysNuminMonthV1(leapYearV1);
		int result = daysNuminMonthV1.getDaysNuminMonth(2, 2008);
		assertEquals(29, result);	
	}
	
	@Test
	public void testQ3_2(){
		LeapYearV1 leapYearV1 = new LeapYearV1();
		DaysNuminMonthV1 daysNuminMonthV1 = new DaysNuminMonthV1(leapYearV1);
		int result = daysNuminMonthV1.getDaysNuminMonth(2, 2003);
		assertEquals(28, result);	
	}
	
}
