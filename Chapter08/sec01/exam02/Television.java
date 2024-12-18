package sec01.exam02;

import sec01.exam01.RemoteControl;

public class Television implements RemoteControl, Searchable // 다중 인터페이스
{
	// field
	private int volume;
	
	// RemoteControl 인터페이스 추상메소드에 대한 실체 메소드
	// TurnOn() 추상 메소드의 실체 메소드
	public void TurnOn() {System.out.println("Tv를 켭니다.");}
	// TurnOff() 추상 메소드의 실체 메소드
	public void TurnOff() {System.out.println("Tv를 끕니다.");}
	
	// SetVolume() 추상 메소드의 실체 메소드
	public void SetVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}
		else if(volume<RemoteControl.MIN_VOLUME)
		{
			this.volume=RemoteControl.MIN_VOLUME;
		}
		else this.volume=volume;
		
		System.out.println("현재 TV 볼륨: "+this.volume);
	}
	
	// 다중 인터페이스에서 Searchable 인터페이스의 추상 메소드에 대한 실체메소드
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
	}
}
