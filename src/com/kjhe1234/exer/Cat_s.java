package com.kjhe1234.exer;

public class Cat_s extends Animal_s {  // Animal_s 클래스를 상속 받음
	String catName;
	
	public void catWorking() {
		System.out.println("고양이가 걷는다.");
		
	}

	@Override
	public void cry() {
		System.out.println("야옹.");
		
	}
	

}
