package sec05.exam05;

public class Person {
	final String nation="Korea"; 
	final String ssn; // Person객체가 생성될때 부여됨 (생성자 매개값이 초기값)
	String name;
	
	public Person(String ssn, String name) {
		this.ssn=ssn;
		this.name=name;
	} // 생성자
}
