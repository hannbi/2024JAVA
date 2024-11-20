package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child=new Child();
		
		Parent parent=child; // Parent로 자동타입 변환 parent와 child는 같은 Child()객체 참조
		parent.method1();
		parent.method2(); // 재정의된 메소드가 호출 
		//parent.method3(); // 자식클래스에만 있는 메소드 사용 불가

	}

}
