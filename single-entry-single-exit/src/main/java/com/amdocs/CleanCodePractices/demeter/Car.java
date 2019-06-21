package com.amdocs.CleanCodePractices.demeter;

public class Car {
	public static void main(String args[]) {
		Wiper wiper = new Wiper(150);
	}
}

class Wiper {
	int length;
	
	public Wiper(int lenth) {
		this.length = length;
	}
	
	public void cleanWindSield() {
		this.pumpWater();
		this.startMotor();
	}
	
	private void startMotor() {
		
	}
	
	private void pumpWater() {
		
	}
}
