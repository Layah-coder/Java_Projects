/*
 * Leah Oswald
 * SPC ID#: 2420610
 * Program that uses array, ArrayList, and LinkedList to store Employee objects. 
 * Program also sorts and displays objects.
 * */

package oswald20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeeMain {

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
		
		//Sort ArrayList by salary and then by last name.
		Collections.sort(employeeList, Comparator.comparing(Employee::getSalary).thenComparing(Employee::getLastName));
		System.out.println("\n---Employees sorted, in ascending order, by salary and last name---\n");
		
		//Display ArrayList after sorting with foreach and lambda expression.
		employeeList.forEach(e -> System.out.println(e));
		
		//Create LinkedList.
		LinkedList<Employee> employeeLinked = new LinkedList<>();
		
		//Copy ArrayList to LinkedList.
		employeeLinked.addAll(employeeList);
		
		//Execute cutBack and pass LinkedList as argument.
		cutBack(employeeLinked);
		
		//Create ListIterator.
		ListIterator<Employee> iterator = employeeLinked.listIterator();
		
		//Iterate forward through the LinkedList.
		while (iterator.hasNext()) {
			iterator.next();	
		}
		
		System.out.println("---Traversing backwards through the modified employee list---\n");
		
		//Iterate backwards through LinkedList.
		while (iterator.hasPrevious()) {
			//Display employee.
			System.out.println(iterator.previous());
		}

	}	
	
	//Method that accepts LinkedList as its only parameter.
	public static void cutBack(LinkedList<Employee> list) {
		
		//Display first and last name of highest salary on list, last name on list.
		System.out.println("\n" + list.getLast().getFirstName() + " " + list.getLast().getLastName() +
				" was removed for having the highest salary.\n");
		//Remove highest salary, last on list.
		list.removeLast();


	}
}
