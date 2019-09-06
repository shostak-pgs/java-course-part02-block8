package by.htp.part02.block9.Ex5;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Account ac1 = new Account(12345, 1000.2);
		Account ac2 = new Account(14567, 200.5);
		Account ac3 = new Account(34567, -10.9);
		Account ac4 = new Account(14569, 123.8);
		Account ac5 = new Account(17823, -999.9);
		Account ac6 = new Account(34256, -10.9);
		
		List<Account> customer1 = new ArrayList<>(); 
		customer1.add(ac1);
		customer1.add(ac2);
		customer1.add(ac3);
		
		List<Account> customer2 = new ArrayList<>();
		customer1.add(ac4);
		customer1.add(ac5);
		customer1.add(ac6);
		
		Customer alex = new Customer("Alex", customer1);
		Customer bob = new Customer ("Bob", customer2);
		

	}

}
