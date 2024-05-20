package com.kjhe1234.exer3;

public abstract class Phone_s {
	
	public String owner;

	public Phone_s(String owner) {
		super();
		this.owner = owner;
	}
	
	public abstract void turnOn();  // 추상 메소드
	
	public abstract void turnOff();

	
}
