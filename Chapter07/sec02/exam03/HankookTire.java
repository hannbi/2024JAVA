package sec02.exam03;

public class HankookTire extends Tire{
	// field 
	// constructor
	public HankookTire(String location, int maxRotation) {
		super(location,maxRotation); // 부모 생성자 호출
	}
	
	// method // 메소드 재정의
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"HankookTire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}
		else {
			System.out.println("***"+location+"HankookTire펑크***");
			return false;
		}
	}

}
