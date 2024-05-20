package com.kjhe1234.exer2;

public class Company_s {
	String name;  // 필드
	int age; // 필드
	
	Human_s human1 = new Human_s(); // 필드
	Human_s human2 = new Human_s(); 
	Human_s human3 = new Human_s();
	Human_s human4;  // 초기화가 안된 필드 선언
	
	public void work(Human_s human) {  // 매개변수가 클래스로 선언된 객체
		human.namePrint();
		
	}
	
}
