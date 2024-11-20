package sec01.exam02;

import sec01.exam01.RemoteControl;

public class Audio implements RemoteControl{
	// field
	private int volume;
	
	// TurnOn() 추상 메소드의 실체 메소드
	public void TurnOn() {
		System.out.println("Audio를 켭니다");
	}
	// TurnOff() 추상 메소드의 실체 메소드
	public void TurnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
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
		
		System.out.println("현재 Audio 볼륨: "+this.volume);
	}
	

}
