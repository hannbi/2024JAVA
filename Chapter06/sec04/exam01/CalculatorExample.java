package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc=new Calculator();
		myCalc.powerOn(); // powerOn메소드 호출
		
		int result1=myCalc.plus(5, 6); // plus메서드 호출
		System.out.println("result1: "+result1);
		
		byte x=10;
		byte y=4;
		
		double result2=myCalc.divide(x, y); //divide메서드 호출
		System.out.println("result2: "+result2);
		
		myCalc.powerOff();
		
	}
}
