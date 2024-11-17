package sec01.exam03;

public class Computer extends Calculator{
	@Override 
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle90 실행");
		return Math.PI*r*r; // 더 정밀하게 메소드 재정의
	}
}
