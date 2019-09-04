package by.htp.part02.block9.Ex2;

import java.time.LocalTime;

public class Engine {
	
	private String engineDescription;
	private float volume;
	
	public Engine(String engineDescription, float volume) {
		this.setEngineDescription(engineDescription);
		this.volume = volume;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	public Engine getEngine() {
		return this;
	}

	public void setAngineDescription(String engineDescription) {
		this.setEngineDescription(engineDescription);
	}

	public String getEngineDescription() {
		return engineDescription;
	}

	public void setEngineDescription(String engineDescription) {
		this.engineDescription = engineDescription;
	}
	
	public boolean startEngine(int fuel, Car car) {
		long fuell = (long)fuel;		
		car.isMoove = true;
		long t = LocalTime.now().toSecondOfDay() + (long)fuell * 1;
		
		while (LocalTime.now().toSecondOfDay() <= t) {			
			for(Wheel w : car.getWheel())
		    w.speen();
		}
		car.setFuel(0);
		
		System.out.println("Бак пуст");
		return false;
	}

}
