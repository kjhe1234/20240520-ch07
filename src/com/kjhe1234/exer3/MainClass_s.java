package com.kjhe1234.exer3;

public class MainClass_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car_s car = new Car_s();  // 추상클래스는 객체를 생성할 수 없음
		//-> 추상클래스 -> 객체의 기본 설계도 역할만 한다 -> 상속용도로만 사용
		
		//Phone_s phone = new Phone_s();
		SmartPhone_s smartPhone = new SmartPhone_s("홍길동");
		
		smartPhone.turnOn();
		smartPhone.turnOff();
		smartPhone.internetSearch();
		
	}

}
