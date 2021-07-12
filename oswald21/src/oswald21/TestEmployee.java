/*
 * Leah Oswald SPC ID# 2420610
 * Program that stores and array of employee objects,
 * creates an arraylist from the array,
 * creates a treemap from the arraylist,
 * uses employee ID as key and displays the treemap.
 * */

package oswald21;

import java.util.*;

public class TestEmployee {

	public static void main(String[] args) {
		//Create Array that holds 11 Employee objects, with values.
		Employee[] employeeArray = {new Employee("101", "Coquina", "Anna", 81000),
				new Employee("121", "William", "Frank", 76000),
				new Employee("104", "Brooks", "Beverly", 82000),
				new Employee("131", "Quina", "Zachary", 62000),
				new Employee("102", "Frank", "Lillian", 81000),
				new Employee("122", "Richards", "James", 20000),
				new Employee("129", "Demaris", "Lorenzo", 81000),
				new Employee("103", "Smith", "John", 76000),
				new Employee("128", "Doe", "Jane", 82000),
				new Employee("105", "Waters", "Brenda", 91000),
				new Employee("127", "Jones", "Elizabeth", 82000)};

		//Create ArrayList.
		ArrayList<Employee> employeeList = new ArrayList<>();
		
		//Copy array to ArrayList.
		Collections.addAll(employeeList, employeeArray);
		
		System.out.println("\nAll Employees\n");
		
		//Display ArrayList.
		for(Employee e: employeeList) {
			System.out.println(e);}

		//Create TreeMap that uses Strings for keys and Employees as values.
		TreeMap<String, Employee> treeMap = new TreeMap<String, Employee>();
		
		//Process the arraylist.
		for (Employee e: employeeList) {
			//Add employee to treemap by employee id# as key mapped to associated Employee value.
			treeMap.put(e.getId(), e);
		}
		
		System.out.println("\nEmployees By ID #\n");
		
		//Use treemaps forEach method and lambda to print all employees in ID # order.
		treeMap.forEach((k, v) -> System.out.println(v));

	}
}
