package by.htp.part02.block9.Ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.htp.part02.block9.Ex5.Food;
import by.htp.part02.block9.Ex5.TransportComparator;
import by.htp.part02.block9.Ex5.Voucher;

public class AccounLogic {
    
	public DataBase findById(DataBase db, int id) {
		
		DataBase rez = new DataBase(new ArrayList<User>(db.getdBase()));
		
		for (User u : db.getdBase()) {
			User uSer = new User(new ArrayList<>(u.getAccList()));			
				Collections.copy(uSer.getAccList(), u.getAccList());
				rez.addUser(uSer);
			}			
		
		for (User us : rez.getdBase()) {			
			us.getAccList().removeIf(a -> a.getId() != id);			
		}	
    	return rez;
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
