package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone=new Phone(); // 추상클래스는 객체를 생성할 수 없다.
		Smartphone smartphone=new Smartphone("김한비");
		
		smartphone.TurnOn(); // phone 추상클래스의 메소드
		smartphone.internetSearch();
		smartphone.TurnOff(); // phone 추상클래스의 메소드

	}

}
