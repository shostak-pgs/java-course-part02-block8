package by.htp.part02.block9.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VoucherLogic {

	public void sortByFood(VoucherList list) {
		Collections.sort(list.getList(), new FoodComparator());	
	}
	
	public void sortByDuration(VoucherList list) {
		Collections.sort(list.getList(), new FoodComparator());		
	}
	
	public void sortByTransport(VoucherList list) {
		Collections.sort(list.getList(), new FoodComparator());	
	}
	
	public VoucherList searchByFood(VoucherList list, Food food) {   //Возращает List путевок с данным типом питания, 
		List<Voucher> aList = new ArrayList<>(list.getList());       //выбран т.к.может быть несколько путевок с одинаковым типом питания
		Collections.copy(aList, list.getList());		
		
		aList.removeIf(a -> a.getFood() != food);
		
		return new VoucherList(aList);
	}
	
	public VoucherList searchByTransport(VoucherList list, Transport transport) {    //Возращает List путевок с данным типом питания,
		List<Voucher> aList = new ArrayList<>(list.getList());                       //выбран т.к.может быть несколько путевок с одинаковым типом транспорта
		Collections.copy(aList, list.getList());		
		
		aList.removeIf(a -> a.getTransport() != transport);
		
		return new VoucherList(aList);
	}
	
	public VoucherList searchByDuration(VoucherList list, int duration) {     //Возращает List путевок с данным типом питания,
		List<Voucher> aList = new ArrayList<>(list.getList());                //выбран т.к.может быть несколько путевок с одинаковым типом транспорта
		Collections.copy(aList, list.getList());		
		
		aList.removeIf(a -> a.getDuration() != duration);
		
		return new VoucherList(aList);
	}
	
}
