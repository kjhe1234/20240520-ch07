package com.kjhe1234.exer2;

public class MainClass_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company_s company = new Company_s();
		company.name = "홍길동";
		
		company.human1 = new Student_s();  // 업캐스팅
		company.human2 = new Worker_s();   // 업캐스팅
		company.human3 = new Soldier_s();   // 업캐스팅
		
		Human_s human = new Worker_s();  // 업캐스팅
		
		company.work(human);
		
		
	}

}
