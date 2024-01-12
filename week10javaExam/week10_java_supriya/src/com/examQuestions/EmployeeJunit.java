package com.examQuestions;

import java.util.List;
import java.util.stream.Stream;

//6. Write a program and check whether employee existing or not by passing employee name using JUNIT?


public class EmployeeJunit {
    
	public boolean emp(String employeeName) {
		
		List<Employee> records = EmployeeRecords.records();
		Stream<Employee> filter = records.stream().filter(e->e.getName()==employeeName);
		if(filter!=null)
		{
			return true;
		}
		return false;
	}
	
}
