package sec01.exam06;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time=(int)(Math.random()*4)+8; //8<=~<=11사이의 정수 뽑기
		System.out.println("[현재시간: "+time+"시]");
		
		switch(time) // switch문에 break가 없으면 해당값 case실행 후 나머지 case값 연달아 실행
		{
		case 8: 
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default: // case 11
			System.out.println("외근을 나갑니다.");
		}
		

	}

}
