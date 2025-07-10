package org.edu;

public class Education extends Arts {
	@Override
	public void ug(int dhiraj) {
		System.out.println("dhiraj college total students count in 2024 is "+dhiraj);
		super.ug(1800);
	
	

}
@Override
public void pg(int sona) {
	System.out.println("sona college total students count in 2024 is "+ sona);
	super.pg(3500);
}
public static void main(String[] args) {
	Education e = new Education();
	e.ug(2800);
	e.pg(4000);
}
}
