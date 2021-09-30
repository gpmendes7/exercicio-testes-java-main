package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	
	@Test
	public void constructorShouldCreateObjectWithCorrectDataWhenValidData() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}
	
	@Test
	public void constructorShouldThrowExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Financing(100000.0, 2000.0, 20);
		});
	}
	
	@Test
	public void setTotalAmountShouldUpdateAmountWhenValidData() {
		double expectedValue = 50000.0;
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		f.setTotalAmount(expectedValue);
		
		Assertions.assertEquals(expectedValue, f.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldThrowExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 20);
			f.setTotalAmount(200000.0);
		});
	}
	
	@Test
	public void setIncomeShouldUpdateIncomeWhenValidData() {
		double expectedValue = 3000.0;
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		f.setIncome(expectedValue);
		
		Assertions.assertEquals(expectedValue, f.getIncome());
	}

	@Test
	public void setIncomeShouldThrowExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 500.0, 20);
			f.setTotalAmount(200000.0);
		});
	}
	
	@Test
	public void setMonthsShouldUpdateIncomeWhenValidData() {
		int expectedValue = 1000;
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		f.setMonths(expectedValue);
		
		Assertions.assertEquals(expectedValue, f.getMonths());
	}
	
	@Test
	public void setMonthsShouldThrowExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 10);
			f.setTotalAmount(200000.0);
		});
	}
	
	public void entryShouldCalculateAndReturnEntry() {
		int expectedValue = 20000;
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(expectedValue, f.entry());
	}
	
	public void quotaShouldCalculateAndReturnQuota() {
		int expectedValue = 1000;
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(expectedValue, f.quota());
	}
}
