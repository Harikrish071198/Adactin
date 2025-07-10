package org.univ;

public class College extends University{
@Override
public void ug(int sona) {
	System.out.println("sona ug admission is higher in"+sona);
	super.ug(2022);
}
@Override
	public void pg(String sona) {
		System.out.println("sona pg admission is "+sona);
		super.pg("last year");
	}
public static void main(String[] args) {
	College c= new College();
	c.ug(2024 );
	c.pg("lower tha previous year");
}
}
