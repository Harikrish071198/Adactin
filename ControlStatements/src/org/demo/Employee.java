package org.demo;

public class Employee {
private void eligibilityForVote(int age) {
	if(age>18) {
		System.out.println("eligible for vote");
	}
	else {
		System.out.println("not eligible for vote");
	}
}
private void eligibilityForBloodDonate(int age , int weight) {
if(age>18 && weight>50) {
	System.out.println("Eligible for blood donate");
}
else {
	System.out.println("Not eligible for donate");
}

}
private void eligibilityForGym(int age ,int weight) {
if(age>18 || weight>50) {
	System.out.println("Eligibility for going to gym");
}
	else {
		System.out.println("not eligible for going to gym");
	}
}
private void findTallestBoy(int a,int b,int c) {
	if(a>b && a>c) {
		System.out.println("A is the tallest boy");
	}
	else if(b>a && b>c) {
		System.out.println("B is the tallest boy");
	}
	else if (c>a && c>b) {
		System.out.println("C is the tallest boy");
	}

}
private void findDays(int days) {
	switch(days) {
	case 1:
	{
		System.out.println("Monday");
		break;
	}
	case 2:
	{
		System.out.println("tuesday");
		break;
	}
	case 3:
	{
		System.out.println("wednesday");
	}
	case 4:
	{ 
		System.out.println("thursday");
	}
	case 5:
	{
		System.out.println("friday");
	}
	case 6:
	{ 
		System.out.println("saturday");
		
	}
	case7:
	{
		System.out.println("sunday");
	}
	default:
	{
		System.out.println("Not match");
	}
	
	
	}

}



public static void main(String[] args) {
	Employee e = new Employee();
	e.eligibilityForVote(43);
	e.eligibilityForBloodDonate(19, 76);
	e.eligibilityForGym(17, 56);
	e.findTallestBoy(66, 70, 78);
	e.findDays(7);
}
}
