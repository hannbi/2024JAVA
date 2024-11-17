package sec01.exam01;

public class DmbCellPhone extends Cellphone{
	// field
	int channel;
	
	// constructor
	DmbCellPhone(String model, String color, int channel){
		this.model=model; // Cellphone 클래스의 상속 필드
		this.color=color; // Cellphone 클래스의 상속 필드
		this.channel=channel;
	}
	
	// method
	void turnOnDmb() {
		System.out.println("채널 "+channel+"번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널 "+channel+"번으로 변경합니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 중단합니다.");
	}
}
