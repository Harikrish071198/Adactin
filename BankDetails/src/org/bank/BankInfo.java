package org.bank;

public class BankInfo extends AxisBank{

@Override
	public void deposit(int deposit) {
		System.out.println("deposit in jun month is "+deposit);
		super.deposit(56000);
	}
public static void main(String[] args) {
	BankInfo b = new BankInfo();
	b.deposit(87000);
}


}
