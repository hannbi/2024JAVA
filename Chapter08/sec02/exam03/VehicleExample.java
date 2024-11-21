package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle=new Bus();
		
		vehicle.run();
		// vehicle.checkFare(); // vehicle 인터페이스에는 checkfare() 없음
		
		Bus bus=(Bus) vehicle; // 구현 클래스 타입으로 강제 변환
		
		bus.run(); 
		bus.checkFare(); // bus 클래스에는 checkfare() 있음 

	}

}
