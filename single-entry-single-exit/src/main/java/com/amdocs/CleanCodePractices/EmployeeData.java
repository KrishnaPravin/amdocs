package com.amdocs.CleanCodePractices;

public class EmployeeData {

	public static void main(String[] args) {
		Employee emp1 = EmployeeFactory.getEmployee("Lokesh"); 
		Employee emp2 = EmployeeFactory.getEmployee("Kushagra"); 
		Employee emp3 = EmployeeFactory.getEmployee("Vikram"); 
		Employee emp4 = EmployeeFactory.getEmployee("Rishabh"); 
  
  
        System.out.println(emp1.getClient()); 
        System.out.println(emp2.getClient()); 
        System.out.println(emp3.getClient()); 
        System.out.println(emp4.getClient()); 
	}

}

class EmployeeFactory {
	protected static final String[] developers = {"Lokesh", "Kushagra", "Vikram"};
	
	public static Employee getEmployee(String name) {
		for (String developer : developers) {
			if (developer.equalsIgnoreCase(name)) return new Developer(name);
		}
		return new NullDeveloper(name);
	}
}

abstract class Employee {
	protected String name;
	
	protected abstract String getClient();
}

class Developer extends Employee {
	public Developer (String name) {
		this.name = name;
	}
	
	@Override
	protected String getClient() {
		return this.name + "'s Client";
	}
}

class NullDeveloper extends Employee {
	public NullDeveloper(String name) {
		this.name = name;
	}
	
	@Override
	protected String getClient() {
		return "No Clients Available";
	}
}
