// CAN NOT RUN
public class BuilderDemo {

}

class Computer {
	public Computer(MotherBoard mb,
			CPU cpu,
			CoolingSystem coolingSystem,
			VideoCard vc,
			SoundCard sc,
			RAM[] ram,
			StorageDrive drive,
			OpticalDrive opcticalDrive) {
		
	}
}

class ComputerBuilder {
	private MontherBoard mb;
	private CPU cpu;
	private CoolingSystem coolingSystem;
	private VideoCard vc;
	private SoundCard sc;
	private RAM[] ram;
	private StorageDrive drive;
	private OpticalDrive opcticalDrive;
	
	public void setMotherBoard(MotherBoard mb) {
		this.mb = mb;
	}
	
	public void setCPU(CPU cup) {
		this.cpu = cpu;
	}
	
	public void setCoolingSystem(CoolingSystem coolingSystem) {
		this.coolingSystem = coolingSystem;
	}
	
	public void setVideoCard(VideoCard vc) {
		this.vc = vc;
	}
	
	public void setSoundCard(SoundCard sc) {
		this.sc = sc;
	}
	
	public void setRAM(RAM[] ram) {
		this.ram = ram;
	}
	
	public void setStorageDrive(StorageDrive drive) {
		this.drive = drive;
	}
	
	public void setOpticalDrive(OpticalDrive opticalDrive) {
		this.opticalDrive = opticalDrive;
	}
	
	public Computer toComputer() {
		return new Computer(mb, cpu, coolingSystem, vc, sc, ram, drive, opcticalDrive)
	}
	
}