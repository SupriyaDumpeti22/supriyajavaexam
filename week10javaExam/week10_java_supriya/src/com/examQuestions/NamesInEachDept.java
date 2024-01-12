package com.examQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//5. List down the names of all employees in each department?
public class NamesInEachDept {

	public void namesInDept() {
		List<Employee> records = EmployeeRecords.records();
		Map<String, List<Employee>> collect = records.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		collect.entrySet().stream().forEach(e->{
			System.out.println("Department-"+e.getKey());
			e.getValue().stream().forEach(e1->System.out.println(e1.getName()));
		});
}
	public static void main(String[] args) {
		NamesInEachDept dept=new NamesInEachDept();
		dept.namesInDept();
	}
}
