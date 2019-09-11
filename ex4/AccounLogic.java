package by.htp.part02.block9.ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.htp.part02.block9.ex5.Food;
import by.htp.part02.block9.ex5.TransportComparator;
import by.htp.part02.block9.ex5.Voucher;

public class AccounLogic {
    
	public Account findById(DataBase db, int id) {
		Account account = new Account();		
		for (User us : db.getdBase()) {			
			for (Account acc : us.getAccList()) {
				if (acc.getId() == id) {
					account = acc;
					break;
				}
			}
		} 
		return account;
    }	
   
	public void sortById(User us) {
		Collections.sort(us.getAccList(), new IdComparator());	
	}
	
	public double dBaseBallance(DataBase db) {
		double sum = 0;
		for (User us : db.getdBase()) {			
			for(Account ac : us.getAccList()) {
				sum = sum + ac.getBalance();
		    }    	
        }
		return sum;	
	}
	
	public double dBasePositiveBallance(DataBase db) {
		double sum = 0;
		for (User us : db.getdBase()) {			
			for(Account ac : us.getAccList()) {
				if (ac.getBalance() > 0) {
				sum = sum + ac.getBalance();
		        }    
			}
        }
		return sum;	
	}
	
	public double dBaseNegativeBallance(DataBase db) {
		double sum = 0;
		for (User us : db.getdBase()) {			
			for(Account ac : us.getAccList()) {
				if (ac.getBalance() < 0) {
				sum = sum + ac.getBalance();
		        }    
			}
        }
		return sum;	
	}
}
