package sec01.exam02;
import sec01.exam01.*;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		Television tv=new Television();
		
		RemoteControl rc=tv; // 인터페이스 타입 변수에 객체 대입
		Searchable searchable=tv;

	}

}
