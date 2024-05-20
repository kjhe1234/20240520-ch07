package com.kjhe1234.exer4;

public class MainClass_s {

	public static void main(String[] args) {
		//Car_s car = new Car_s()  // 인터페이스는 new 연산자로 객체 생성 불가
		
		Truck_s truck = new Truck_s();
		
		Car_s car; // 인터페이스 객체(변수) 선언
		
		car = truck; // 업캐스팅 가능

		
	}

}
