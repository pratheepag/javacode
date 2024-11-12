package code;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	public String name;
	public int salary;
	public String department;
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Employee(String name, int salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && Objects.equals(name, other.name)
				&& salary == other.salary;
	}

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
	
}
