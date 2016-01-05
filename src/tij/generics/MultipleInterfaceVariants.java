package tij.generics;

public class MultipleInterfaceVariants {

	interface Payable<T> {
	}

	class Employee implements Payable<Employee> {
	}

	// does not compile
	// class Hourly extends Employee
	// implements Payable<Hourly> {}
}
