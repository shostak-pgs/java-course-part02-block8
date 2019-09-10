package by.htp.part02.block9.ex5;

import java.util.Comparator;



public class TransportComparator implements Comparator<Voucher> {

	@Override
	public int compare(Voucher o1, Voucher o2) {
		
		if(getPoint(o1.getTransport()) > getPoint(o2.getTransport())) 
			return - 1;			
	
		if(getPoint(o1.getTransport()) < getPoint(o2.getTransport())) 
			return 1;
		
		else 
			return 0;		
	}
	
		static int getPoint(Transport o1) {			
			int point = 0;
			switch(o1) {
			    case AIRPLANE:
				    point = 5;
			        break;
			    case TRAIN:
				    point = 4;
				    break;
			    case SHIP:
				    point = 3;
				    break;
			    case BUS:
			   	    point = 2;
				    break;
			    case MINIBUS:
				    point = 1;
				    break;
			}
			return point;
		}

}
