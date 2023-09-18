package sub2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("com")
public class Computer {

	private CPU cpu;
	private RAM ram;
	
	//DI - Filed Inject
	@Autowired
	private HDD hdd;
	
	// DI - Constructor Inject
	@Autowired
	public Computer(CPU cpu) {
		this.cpu = cpu;
	}
	
	//ID - Setter Inject
	@Autowired
	public void setRam(RAM ram) {
		this.ram = ram;
	}
	
	
	public void show() {
		cpu.show();
		ram.show();
		hdd.show();
	}
	
}
