package sec03.exam01;

public abstract class Phone // 추상 클래스
{
	// field
	public String owner;
	
	// constructor
	public Phone(String owner) {this.owner=owner;}
	
	// method
	public void TurnOn() {System.out.println("폰 전원을 켭니다");}
	public void TurnOff() {System.out.println("폰 전원을 끕니다");}
	
	
}
