package sec02.exam07;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray=new String[3];
		strArray[0]="Java";
		strArray[1]="Java";
		strArray[2]=new String("Java"); // 새로운 String 객체 생성
		
		System.out.println(strArray[0]==strArray[1]);
		System.out.println(strArray[0]==strArray[2]);
		System.out.println(strArray[0].equals(strArray[2])); // equals 메소드는 객체안의 문자열 비교

	}

}
