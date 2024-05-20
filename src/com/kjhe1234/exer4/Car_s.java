package com.kjhe1234.exer4;

public interface Car_s { // 인터페이스 선언
	// 인터페이스 내의 모든 메소드는 추상메소드로 사용됨
	
	String modelName = "galaxy"; // 상수만 선언 가능
	
	public void frontDrive();  // 일반메소드로 선언해도 추상메소드로 사용됨
	public void rearDrive();
	public void stopDrive();
	public void hornDrive();


	

//	public static void backDrive() {
//		System.out.println("후진중");
//	} 
	
}
