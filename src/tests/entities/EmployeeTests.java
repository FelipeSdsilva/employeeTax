package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Employee;

public class EmployeeTests {

	@Test
	public void salaryShouldEncreaseWhenPercentageIfBiggerZero() {
		
		double percentage = 10.0;
		double salary = 1000.0;
		double expectedValue = 1100.0;
		
		Employee emp = new Employee(1L,"Joaquim","Amaral","Dev",salary);
		
		emp.increaseSalary(percentage);
		
		Assertions.assertEquals(expectedValue ,emp.getSalary());
	}
}
