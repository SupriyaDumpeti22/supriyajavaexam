package com.examQuestions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeeJunitTest {

	EmployeeJunit junit=new EmployeeJunit();
	@Test
	public void employeeTest() {
		boolean emp = junit.emp("Kamal");
		assertEquals(true, emp);
	}
}
