package code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sample {
	public static void main(String args[]) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("John", 1000, "IT"));
		employees.add(new Employee("Jane", 2000, "HR"));
		employees.add(new Employee("Jack", 3000, "ADMIN"));
		employees.add(new Employee("Jill", 4000, "IT"));
		employees.add(new Employee("Joe", 5000, "IT"));

		Map<String, Optional<Employee>> employeesMap = employees.stream().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
		System.out.println("Highest salary dept wise:: \n" + employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)),
								(Optional<Employee> emp) -> emp.get().getSalary()))));
		//employeesMap.forEach((key, value) -> System.out.println(key + " " + value.get().getSalary()));
	}
}
