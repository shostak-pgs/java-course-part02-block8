package by.htp.part02.block9.ex4;

import java.util.Comparator;

public class IdComparator implements Comparator<Account> {

	@Override
	public int compare( Account o1, Account o2) {
		
		if(o1.getId() > o2.getId()) 
			return - 1;			
	
		if(o1.getId() > o2.getId()) 
			return 1;
		
		else 
			return 0;		
	}
}
