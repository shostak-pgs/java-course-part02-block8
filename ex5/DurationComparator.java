package by.htp.part02.block9.ex5;

import java.util.Comparator;

public class DurationComparator implements Comparator<Voucher> {
	
	@Override
	public int compare(Voucher o1, Voucher o2) {
				
		if(o1.getDuration() > o2.getDuration()) 
			return 1;			
			
		if(o1.getDuration() < o2.getDuration()) 
			return - 1;
				
		else 
			return 0;		
		}
}
