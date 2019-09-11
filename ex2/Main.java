package by.htp.part02.block9.ex2;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("Audi Q3", new Engine("2.0 TFSI", 2.0f), new Wheel[] {new Wheel(18),new Wheel(18),new Wheel(18),new Wheel(18)});
        Driver driver = new Driver(car);
        driver.describeCar();
       
        oops(car);
        
        driver.changeAWheel();
       
        driver.driverAddFuel(5);
        driver.checkFuel();        
        driver.drive();   
        
        driver.driverAddFuel(2);
        driver.checkFuel();
        driver.drive();   
	}
	
	public static void oops(Car car) {
		Random random = new Random();
		int i = (random.nextInt(4));
		Wheel[] wheel = car.getWheel(); 
		wheel[i].setCrash(true);
		System.out.printf("Колесо %s пробито %n", i + 1 );
		car.setWheel(wheel);
	}
}
