package sec03.exam01;

public class Smartphone extends Phone{
	// constructor
	public Smartphone(String owner) {
		super(owner); // 상속받은 생성자
	}
	// method
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
