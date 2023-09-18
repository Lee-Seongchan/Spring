package sub1;

public class SamsungTv {

	private Speaker spk; //초기화 하지 않아 원래 에러이지만...Sprinh에서는 주입받기 때문에 가능
	
	public void powerOn() {
		System.out.println("SamsungTv powerOn...");
	}
	
	public void powerOff() {
		System.out.println("SamsungTv powerOff...");
	}
	
	public void soundUp() {
		spk.soundUp();
	}
	
	public void soundDown() {
		spk.soundDown();
	}
	
}
