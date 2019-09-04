package by.htp.part02.block9.Ex2;

/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 *  Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class Car {
    private String brand;
    private Engine engine;
    private Wheel[] wheel;
    private int fuelTankVolume = 55;
    int fuel;
    boolean isMoove = false;
	
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
	
	public void setEngineVolume(Engine engine) {
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
		if (isMoove == false) {			
		    isMoove = this.engine.startEngine(this.fuel, this);
		}			
	}    
}
