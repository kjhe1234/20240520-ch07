package com.kjhe1234.exer3;

public class Truck_s extends Car_s {
	// 부모클래스의 추상메소드는 반드시 오버라이딩해서 자식클래스에서 사용해야함!!
	public void drive() {  // Car_s 클래스의 추상메소드인 drive메소드를 오버라이딩 함
		System.out.println("트럭 운전");
	}

}
