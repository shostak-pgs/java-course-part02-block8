package by.htp.part02.block9.ex2;

public class Driver { 	
	Car car;    
    
	public Driver(Car car) {
    	this.car = car;
    }
	
    public void describeCar() {
    	System.out.printf("My car is %s %s! %n", car.getEngine().getEngineDescription(), car.getBrand());
    }
    
    public void drive() {
    	car.go();
    }
    
    public int checkFuel() {
    	System.out.println("В баке " + car.getFuel() + " литров");
    	return car.getFuel();
    }
    
    public void driverAddFuel(int fuel) {    	
    	if (car.isMovement() == false) {
		    car.addFuel(fuel);		   
    	}
	}
    
    public void changeAWheel() {
    	for (int i = 0; i < car.getWheel().length; i++) {
    		Wheel[] wheel = car.getWheel(); 
    		if (wheel[i].isCrash() == true) {
    			wheel[i] = new Wheel(wheel[i].getSize());
    			System.out.println("Колесо " + (i + 1) + " заменено");
    			break;
    		}
    	}
    }    

	@Override
	public String toString() {
		return "Driver [car=" + car + "]";
	}
    
    @Override
    public int hashCode() {
    	int prime = 31;
    	int rez = 1;
    	rez = prime * rez + ((car == null) ? 0 : car.hashCode());
    	return rez;
    }
    
    @Override
    public boolean equals(Object obj) {
    	if (this == obj) {
    		return true;
    	}
    	if (obj == null) {    		
    		return false;
    	}
    	if (this.getClass() != obj.getClass()) {
    		return false;
    	}
    	Driver driver = (Driver)obj;
    	if (car == null) {
    		if (driver.car != null) {
    			return false;
    		}
    	} else if (!car.equals(driver.car)) {
    		return false;
    	}    	
    	return true;
    }  
}
