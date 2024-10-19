package sec02.exam09;

public class BreakOutterExample {

	public static void main(String[] args) {
		Outter: for(char upper='A'; upper<='Z'; upper++) // 반복문에 Outter라는 이름을 붙임
		{
			for(char lower='a';lower<='z'; lower++)
			{
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break Outter; //그냥 break만 적을경우 가장 가까운 반복문만 빠져나가서 A-g, B-g 이런식으로 소문자 g까지만 출력
				}
			}
		}
		System.out.println("프로그램 실행 종료");

	}

}
