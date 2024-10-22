package sec05.exam03;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed+"으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car mycar=new Car(); // main메소드도 static이다보니 객체 생성 후 참조변수로 접근
		mycar.speed=60;
		mycar.run();
	}

}
