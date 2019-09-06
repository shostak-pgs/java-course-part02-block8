package by.htp.part02.block9.Ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TravelAgent {
	public static void main(String[] args) {
		TravelAgent archi = new TravelAgent();		
		Voucher[] arr = new Voucher[] {Voucher.CRUISE, Voucher.EXCURSION, Voucher.HEART_TREATNENT, Voucher.NERVOUS_TREATMENT, Voucher.SHOPPING, Voucher.VACATION};
		List<Voucher> list = Arrays.asList(arr);
		
		archi.sortByFood(list);
		System.out.println("Sort by food:");
		print(list);
		
		archi.sortByDuration(list);
		System.out.println("Sort by duration:");
		print(list);
		
		archi.sortByTransport(list);
		System.out.println("Sort by transport:");
		print(list);
		
		List<Voucher> searchList = new ArrayList<>();
		searchList = archi.searchByFood(list, Food.ALLINCLUSIVE);
		System.out.println("Search by food: :");
		print(searchList);
		
		List<Voucher> searchList1 = new ArrayList<>();
		searchList1 = archi.searchByTransport(list, Transport.AIRPLANE);
		System.out.println("Search by transport");
		print(searchList1);
		
		List<Voucher> searchList2 = new ArrayList<>();
		searchList2 = archi.searchByDuration(list, 21);
		System.out.println("Search by duration:");
		print(searchList2);
	}
	
	private void sortByFood(List<Voucher> list) {
		Collections.sort(list, new FoodComparator());	
	}
	
	private void sortByDuration(List<Voucher> list) {
		Collections.sort(list, new DurationComparator());		
	}
	
	private void sortByTransport(List<Voucher> list) {
		Collections.sort(list, new TransportComparator());	
	}
	
	private List<Voucher> searchByFood(List<Voucher> list, Food food) {
		List<Voucher> aList = new ArrayList<>(list);
		Collections.copy(aList, list);		
		
		aList.removeIf(a -> a.getFood() != food);
		
		return aList;
	}
	
	private List<Voucher> searchByTransport(List<Voucher> list, Transport transport) {
		List<Voucher> aList = new ArrayList<>(list);
		Collections.copy(aList, list);		
		
		aList.removeIf(a -> a.getTransport() != transport);
		
		return aList;
	}
	
	private List<Voucher> searchByDuration(List<Voucher> list, int duration) {
		List<Voucher> aList = new ArrayList<>(list);
		Collections.copy(aList, list);		
		
		aList.removeIf(a -> a.getDuration() != duration);
		
		return aList;
	}
	
	public static void print(List<Voucher> v) {
		v.forEach(s -> System.out.printf("%s %s %s %s %n", s, s.getFood(), s.getTransport(), s.getDuration()));
	}

}
