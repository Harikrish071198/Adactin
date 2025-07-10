package org.company;

public class CompanyInfo {
private void companyName(String name) {
System.out.println("company name is "+ name);
this.companyName(67900);
this.companyName("anna nagar", 600767);
}
private void companyName(String adress, int pincode) {
	System.out.println("adress is "+adress+"\n"+"pincode is "+pincode);

}
private void companyName(int Id) {
	System.out.println("company Id is "+Id);

}
public static void main(String[] args) {
	CompanyInfo c = new CompanyInfo();
	c.companyName("sai vignesh");
}

public CompanyInfo() {
	// TODO Auto-generated constructor stub
}
}
