package a240902;

class DeskLamp{
	
	boolean isOn;
	
	public void turnOff() {
		isOn = false;
	}
	public void turnOn() {
		isOn = true;
	}
	public void ShowResult() {
		if(isOn==false)
		System.out.println("현재 램프는 꺼져있습니다");
		else System.out.println("현재 램프는 켜져있습니다");
	}
}

public class DL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeskLamp dl = new DeskLamp();
		dl.turnOff();
		dl.ShowResult();
		
		dl.turnOn();
		dl.ShowResult();
	}

}
