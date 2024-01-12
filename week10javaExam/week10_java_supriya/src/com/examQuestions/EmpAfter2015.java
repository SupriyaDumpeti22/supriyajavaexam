package com.examQuestions;

import java.util.List;

//2. Get the names of all employees who have joined after 2015?
public class EmpAfter2015 {

	public void names() {
		List<Employee> records = EmployeeRecords.records();
		records.stream().filter(e->e.getYearOfJoining()>2015).forEach(e->System.out.println(e.getName()+"-"+e.getYearOfJoining()));
	}
	public static void main(String[] args) {
		EmpAfter2015 after2015=new EmpAfter2015();
		after2015.names();
	}
}
