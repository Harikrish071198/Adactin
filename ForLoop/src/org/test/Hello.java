package org.test;

public class Hello {
private void eligibleToVote(int age) {
if(age>18) {
	

System.out.println("eligible for vote");
}
else {
	System.out.println("not eligible for vote");
}
	

}
public static void main(String[] args) {
	Hello h = new Hello();
	h.eligibleToVote(10);
}
}