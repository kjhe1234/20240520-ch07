package com.kjhe1234.exer;

public class MainClass_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat_s cat = new Cat_s(); // 자식객체인 cat 객체 선언 
		
		//Animal_s animal = new Animal_s(); // 부모객체인 animal 객체선언
		
		Dog_s dog = new Dog_s();
		Tiger_s tiger = new Tiger_s();
		//Animal_s animal1 = new Animal_s();
		
		
		int a=1;
		byte b=10;
		a = b;
		// b = a;  에러발생!
		
		double c=1.5;
		int d = 10;
		d = (int)c;
		
		//animal = cat;  // 업 캐스팅 -> 자식클래스의 객체가 부모클래스 타입으로 형변환 되는것
		// cat = animal; 에러발생
		//cat = (Cat_s) animal;  // 다운 캐스팅 -> 부모클래스의 객체가 자식클래스 타입으로 형변환 되는 것

		
		


		Cat_s cat1 = new Cat_s();
		
	
		
//		animal1 = new Dog_s();
//		animal1 = new Tiger_s();
//		animal1 = new Cat_s();
		
		
	}

}
