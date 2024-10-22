package sec04.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom=new Computer();
		
		int[]values1= {1,2,3};
		int result1=myCom.sum1(values1); // 배열로 넘겨줌
		System.out.println("result1: "+result1);
		
		int result2=myCom.sum1(new int[] {1,2,3,4,5}); // new int[]사용 배열 넘겨줌
		System.out.println("result2: "+result2);
		
		int result3=myCom.sum2(1,2,3); // 배열항목으로 넘겨줌
		System.out.println("result3: "+result3);
		
		int result4=myCom.sum2(1,2,3,4,5);
		System.out.println("result4: "+result4);
	}

}
