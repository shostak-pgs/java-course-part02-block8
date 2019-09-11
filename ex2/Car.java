package by.htp.part02.block9.ex2;

import java.util.Arrays;

/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 *  Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class Car {
   
	private String brand;
    private Engine engine;
    private Wheel[] wheel;
    private int fuelTankVolume = 55;
    private int fuel;
    private boolean movement = false;   

	public Car(String brand, Engine engine, Wheel[] wheel) {
    	this.brand = brand;
    	this.engine = engine;
    	this.wheel = wheel;
    }
    
    public String getBrand() {
		return brand;
	}
    
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Engine getEngine() {
		return engine.getEngine();
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Wheel[] getWheel() {
		return this.wheel;
	}
	
	public void setWheel(Wheel...wheel) {
		this.wheel = wheel;
	}	
	
	public void addFuel(int fuel) {		
		if (this.fuel < fuelTankVolume) {	
		    this.fuel = this.fuel + fuel;
		}		
		else if (this.fuel + fuel >= fuelTankVolume) {
		    this.fuel = fuelTankVolume;		
		}
	}
	
	public int getFuel() {
		return fuel;
	}
	
	public void setFuel(int ful) {
		this.fuel = ful;
	}	
	
	public void go() {		
		if (movement == false) {			
		    movement = this.engine.startEngine(this.fuel, this);
		}			
	}
	
	 public int getFuelTankVolume() {
			return fuelTankVolume;
	}

	public void setFuelTankVolume(int fuelTankVolume) {
		this.fuelTankVolume = fuelTankVolume;
	}

	public boolean isMovement() {
		return movement;
	}

	public void setMovement(boolean movement) {
		this.movement = movement;
	}	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + fuel;
		result = prime * result + fuelTankVolume;
		result = prime * result + (movement ? 1231 : 1237);
		result = prime * result + Arrays.hashCode(wheel);
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
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null) {
				return false;
			}
		} else if (!brand.equals(other.brand)) {
			return false;
		}
		if (engine == null) {
			if (other.engine != null) {
				return false;
			}
		} else if (!engine.equals(other.engine)) {
			return false;
		}
		if (fuel != other.fuel) {
			return false;
		}
		if (fuelTankVolume != other.fuelTankVolume) {
			return false;
		}
		if (movement != other.movement) {
			return false;
		}
		if (!Arrays.equals(wheel, other.wheel)) {
			return false;
		}
		return true;
	}
	
	 @Override
	public String toString() {
		return "Car [brand=" + brand + ", engine=" + engine + ", wheel=" + Arrays.toString(wheel) + ", fuelTankVolume="
				+ fuelTankVolume + ", fuel=" + fuel + ", movement=" + movement + "]";
	}
}
