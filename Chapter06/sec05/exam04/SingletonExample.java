package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
		/*
		Singleton obj1=new Singleton();
		Singleton obj2=new Singleton();
		*/
		
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance(); // 메소드는호출 가능
		
		if(obj1==obj2) {
			System.out.println("같은 Singleton 객체입니다."); // 동일한 객체 참조
		}
		else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
