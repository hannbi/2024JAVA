package sec01.exam04;

public class SupersonicAirplane extends Airplane{
		public static final int NORMAL=1;
		public static final int SUPERSONIC=2;
		
		public int flyMode=NORMAL; // 일반비행으로 초기화
		
		@Override
		public void fly() {
			if(flyMode==SUPERSONIC) {
				System.out.println("초음속비행합니다.");
			} else {
				super.fly(); // super로 Airplane(부모클래스) 객체의 fly()메소드 호출
			}
		}
}
