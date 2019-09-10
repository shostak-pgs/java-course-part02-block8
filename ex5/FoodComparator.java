package by.htp.part02.block9.ex5;

import java.util.Comparator;

public class FoodComparator implements Comparator<Voucher> {
	@Override
	public int compare(Voucher o1, Voucher o2) {
			
		if(getPoint(o1.getFood()) > getPoint(o2.getFood())) 
			return - 1;			
		
		if(getPoint(o1.getFood()) < getPoint(o2.getFood())) 
			return 1;
			
		else 
			return 0;		
	}
		
		static int getPoint(Food o1) {			
			int point = 0;
			switch(o1) {
				case ALLINCLUSIVE:
					point = 5;
				    break;
				case THREETIMES:
					point = 4;
				    break;
				case BREAKFASTDINNER:
					point = 3;
					break;
				case BREAKFASTONLY:
				   	point = 2;
					break;				   
		    }
			return point;
		}			

}
