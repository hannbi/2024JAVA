package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent=new Child(); // 자동타입변환
		parent.field1="data1";
		parent.method1();
		parent.method2();
		
		/* 불가능
		 parent.field2="data2"; 
		 parent.method3(); 
		*/
		
		Child child=(Child)parent; // 강제타입변환
		child.field1="yyy";
		child.method3();

	}

}
