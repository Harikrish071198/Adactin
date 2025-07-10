 package org.phone;

public class Phone extends Phone1{
private void phoneInfo(String name) {
	System.out.println("phone name is "+name);
this.phoneInfo(8);
this.phoneInfo("A30", 256);
this.phoneInfo(11001111, "snapdragon");
super.phoneInfo(98755444444l);

}
private void phoneInfo(int ram) {
	System.out.println("phone ram is "+ram);

}
private void phoneInfo(String modelname,int storage) {
	System.out.println("model name is "+modelname+"\n"+"storage is "+storage);

}
private void phoneInfo(int imei,String proccessor) {
	System.out.println("imei number is "+imei+"\n"+"proccessor is "+proccessor);

}
public static void main(String[] args) {
	Phone p = new Phone();
	p.phoneInfo("realme");
	
}
}
