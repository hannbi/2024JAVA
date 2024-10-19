package sec02.exam08;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] oldIntArray={1,2,3};
		
		int[] newIntArray=new int[5]; // 새로운 배열 객체 생성
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i]=oldIntArray[i]; 
		}
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i]+", "); // 복사되지 않은 값은 int[]초기값인 0
		}

	}

}
