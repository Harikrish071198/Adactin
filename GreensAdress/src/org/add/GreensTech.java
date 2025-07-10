package org.add;

public class GreensTech extends Greens {
private void greensOmr(String adress) {
	System.out.println("adress is "+adress);
	this.greensOmr(23);
	this.greensOmr(34, "nehru ");
	this.greensOmr("Omr", 636008);
	super.greensOmr(98776544677l);
}
private void greensOmr(int employees) {
	System.out.println("number of employees is "+employees);

}
private void greensOmr(int doorno , String streetname) {
	System.out.println("door no is "+doorno+"\n"+"streetname is "+streetname);

}
private void greensOmr(String area,int pincode) {
	System.out.println("area is "+area+"\n"+"pincode is "+pincode);

}
public static void main(String[] args) {
	GreensTech g = new GreensTech();
	g.greensOmr("34 near pillayar kovil opp to sai vignesh furniture");
}
}
