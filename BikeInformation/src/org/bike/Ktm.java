package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost(int cost) {
	System.out.println("cost of the bike is"+cost);
		this.speed(220);
	}

	@Override
	public void speed(int speed) {
		System.out.println("top speed is"+speed);
		
	}
	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost(150000);
	}

	
}
