package sec02.exam02;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=100; i++) // i는 지역변수로 for문 안에서만 사용 가능
		{
			sum+=i;
		}
		System.out.println("1~100 합: "+sum); 

	}

}
