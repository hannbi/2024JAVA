package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		Person p1=new Person("123456-1234567","홍길동"); // 객체 생성
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation="usa"; // final로 수정 불가
		//p1.ssn="654321-7654321"; // final로 수정 불가
		p1.name="홍삼원";

	}

}
