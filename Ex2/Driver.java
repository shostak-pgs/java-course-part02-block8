package by.htp.part02.block9.Ex2;

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
    	if (car.isMoove == false) {
		    car.addFuel(fuel);		   
    	}
	}
    
    public void changeAWheel() {
    	for (int i = 0; i < car.getWheel().length; i++) {
    		Wheel[] wheel = car.getWheel(); 
    		if (wheel[i].getCondition() == true) {
    			wheel[i] = new Wheel(wheel[i].getSize());
    			System.out.println("Колесо " + (i + 1) + " заменено");
    			break;
    		}
    	}
    }
}
