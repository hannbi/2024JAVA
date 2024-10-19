package sec02.exam10;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores= {95,71,84,93,87};
		
		int sum=0;
		for(int score:scores)  //scores에서 가져올항목 존재하면 score에 저장 // 즉 반복횟수는 배열의 항목 수
		{
			sum=sum+score;
		}
		System.out.println("점수 총합:"+sum);
		
		double avg=(double) sum/scores.length;
		System.out.println("점수 평균="+avg);

	}

}
