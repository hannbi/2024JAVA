package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1="신민철"; 
		String strVar2="신민철"; // strVar1과동일한 문자열 리터럴
		
		if(strVar1==strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}
		else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3=new String("신민철");
		String strVar4=new String("신민철"); // strVar3와 문자열은 같지만 서로 다른 String 객체 참조
		
		if(strVar3==strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}
		else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}

	}
	
	// String hobby=null은 String 변수가 참조하는 객체가 없다는 뜻
	//String hobby="여행"; // hobby가 String 객체 참조하였으나
	//hobby=null; // null을 대입함으로써 더이상 String 객체 참조 x

}
