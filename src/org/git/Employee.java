package org.git;

public class Employee {
	
	public static Employee object;
	
	public static Employee Creationobject() {
		
		if (object==null) {
			
			System.out.println("before object creation:"+System.identityHashCode(object));
			object = new Employee();
			System.out.println("after object creation:"+System.identityHashCode(object));
		}
		return object;	
	}
	private void empid() {
		
	System.out.println("emp id:1122");
	}
	
	public static void main(String[] args) {
		
	Employee obj1 = Creationobject();
		System.out.println(System.identityHashCode(obj1));
	
		Employee obj2 = Creationobject();
		System.out.println(System.identityHashCode(obj2));
		
		Employee obj3 = Creationobject();
		System.out.println(System.identityHashCode(obj3));
		
		
	}
	}


