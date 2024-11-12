package code;

import java.util.TreeSet;

public class TreeMap {
	public static void main(String args[]) {
		TreeSet<Employee> treemap = new TreeSet<>();
		treemap.add(new Employee("Pragopin2", 30000, "IT"));
		treemap.add(new Employee("Pragopin3", 40000, "IT"));
		treemap.add(new Employee("Pragopin", 10000, "IT"));
		treemap.add(new Employee("Pragopin1", 20000, "IT"));
		System.out.println(treemap);

		
	}
}
