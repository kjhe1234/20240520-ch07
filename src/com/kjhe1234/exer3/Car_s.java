package com.kjhe1234.exer3;

public abstract class Car_s {  // 추상클래스
	String model;
	String color;
	int carAge;
	
	public abstract void drive(); // 추상 메소드 -> 내용이 없는 메소드 -> 선언부만 존재
	
	

	public void horn() {  // 경적
		System.out.println("빵빵");		
	}
	
}
