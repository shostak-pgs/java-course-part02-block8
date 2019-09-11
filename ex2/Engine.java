package by.htp.part02.block9.ex2;

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
		car.setMovement(true);
		long t = LocalTime.now().toSecondOfDay() + (long)fuell * 1;
		
		while (LocalTime.now().toSecondOfDay() <= t) {			
			for(Wheel w : car.getWheel())
		    w.speen();
		}
		car.setFuel(0);		
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engineDescription == null) ? 0 : engineDescription.hashCode());
		result = prime * result + Float.floatToIntBits(volume);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Engine other = (Engine) obj;
		if (engineDescription == null) {
			if (other.engineDescription != null) {
				return false;
			}
		} else if (!engineDescription.equals(other.engineDescription)) {
			return false;
		}
		if (Float.floatToIntBits(volume) != Float.floatToIntBits(other.volume)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Engine [engineDescription=" + engineDescription + ", volume=" + volume + "]";
	}

}
