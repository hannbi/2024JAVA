package sec02.exam03;

public class KumhoTire extends Tire{
	// field 
	// constructor
	public KumhoTire(String location, int maxRotation) {
		super(location,maxRotation); // 부모 생성자 호출
	}
	
	// method // 메소드 재정의
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"KumhoTire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}
		else {
			System.out.println("***"+location+"KumhoTire펑크***");
			return false;
		}
	}
	
}


	

