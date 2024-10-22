package sec03.exam03;

public class Car {
	// 생성자의 오버로딩 클래스
	
	// 필드
	String company="현대자동차"; // company 필드값 초기화
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	// 기본 생성자
	Car(){
	}
	// model 
	Car(String model){
		this.model=model;
	}
	// model, color
	Car(String model, String color){
		this.model=model;
		this.color=color;
	}
	// model, color, maxSpeed
	Car(String model, String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
}
