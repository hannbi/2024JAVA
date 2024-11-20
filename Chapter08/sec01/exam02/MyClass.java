package sec01.exam02;
import sec01.exam01.*;

public class MyClass {
	// field
	RemoteControl rc=new Television(); // Television 객체를 RemoteControl 인터페이스 변수에 대입
	
	// constructor
	MyClass(){
		
	}
	
	MyClass(RemoteControl rc){
		this.rc=rc; 
		rc.TurnOn();
		rc.TurnOff();
		rc.SetVolume(5);
	}
	
	// method
	void methodA() {
		RemoteControl rc=new Audio();
		rc.TurnOn();
		rc.SetVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.TurnOn();
		rc.SetVolume(5);
	}

}
