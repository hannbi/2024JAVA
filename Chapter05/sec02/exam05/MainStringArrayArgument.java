package sec02.exam05;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("값의 수가 부족합니다."); // 입력 데이터 수가 2개가 아닐경우
			System.exit(0); // 프로그램 강제종료
		}
		
		String strNum1=args[0];
		String strNum2=args[1];
		
		int num1=Integer.parseInt(strNum1); // 문자열 정수로 변환
		int num2=Integer.parseInt(strNum2); 
		
		int result=num1+num2;
		System.out.println(num1+"+"+num2+"="+result);
	}
	
	// 이 코드를 그냥 실행하면 첫번째 조건문에 해당하여 프로그램 종료
	// run>program arguments에 입력 데이터 두 개 넣어주면 하단 코드 실행됨 

}
