package org.emp;

public class Employee {


private void employeeId(int Id) {
	System.out.println("employee Id is "+Id);
this.employeeId("hari");
this.employeeId(9876543216l);
}
private void employeeId(String name) {
	System.out.println("name is "+ name);

}
private void employeeId(long mobilenumber) {
	System.out.println("employee mobile number is "+mobilenumber);
}




public static void main(String[] args) {
	Employee e = new Employee();

	e.employeeId(56);
	
	
}
	

}

