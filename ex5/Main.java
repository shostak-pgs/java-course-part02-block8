package by.htp.part02.block9.ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Voucher[] arr = new Voucher[] {new Voucher(TypeOfVoucher.VACATION, Destanation.GREECE, Transport.TRAIN, Food.BREAKFASTONLY, 10),
				new Voucher(TypeOfVoucher.EXCURSION, Destanation.SPAIN, Transport.AIRPLANE, Food.ALLINCLUSIVE, 4),
				new Voucher(TypeOfVoucher.HEART_TREATNENT, Destanation.BELARUS, Transport.MINIBUS, Food.THREETIMES, 21),
				new Voucher(TypeOfVoucher.NERVOUS_TREATMENT, Destanation.SRI_LANKA, Transport.AIRPLANE, Food.THREETIMES, 15),
				new Voucher(TypeOfVoucher.SHOPPING, Destanation.CZECH_REPUBLIC, Transport.BUS, Food.BREAKFASTONLY, 4),
				new Voucher(TypeOfVoucher.CRUISE,Destanation.SRI_LANKA, Transport.SHIP, Food.BREAKFASTDINNER, 8) };
		
		List<Voucher> list = Arrays.asList(arr);
		
		VoucherList vList = new VoucherList(list);
		VoucherLogic vLogic = new VoucherLogic();
		
		vLogic.sortByFood(vList);
		System.out.println("Sort by food:");
		print(vList);
		
		vLogic.sortByDuration(vList);
		System.out.println("Sort by duration:");
		print(vList);
		
		vLogic.sortByTransport(vList);
		System.out.println("Sort by transport:");
		print(vList);
		
		VoucherList searchList = vLogic.searchByFood(vList, Food.ALLINCLUSIVE);		
		System.out.println("Search by food: :");
		print(searchList);
		
		VoucherList searchList1 =  vLogic.searchByTransport(vList, Transport.AIRPLANE);		
		System.out.println("Search by transport");
		print(searchList1);
		
		VoucherList searchList2 = vLogic.searchByDuration(vList, 8);	
		System.out.println("Search by duration:");
		print(searchList2);
	}	
	
	public static void print(VoucherList v) {
		v.getList().forEach(s -> System.out.printf("%s %s %s %s %n", s.getType(), s.getFood(), s.getTransport(), s.getDuration()));
	}	
}
