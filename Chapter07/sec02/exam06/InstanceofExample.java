package sec02.exam06;

public class InstanceofExample {

	public static void method1(Parent parent) {
		if(parent instanceof Child) // parent가 Child 객체인지
		{
			Child child=(Child) parent;
			System.out.println("method1-Child로 변환 성공");
		} 
		else {
			System.out.println("method1-Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child=(Child)parent; // ClasscastException이 발생할 가능성 있음
		System.out.println("method2-Child로 변환 성공");
	}
	
	public static void main(String[]args) {
		Parent parentA=new Child(); // parentA는 Child 객체 자동변환
		method1(parentA);
		method2(parentA);
		
		Parent parentB=new Parent(); // ParentB는 parent 객체
		method1(parentB); 
		//method2(parentB); // 예외 발생
	}

}
