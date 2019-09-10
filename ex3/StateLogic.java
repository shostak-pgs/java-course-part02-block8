package by.htp.part02.block9.ex3;

import java.util.ArrayList;
import java.util.List;

public class StateLogic {

	public static List<City> isRegionCity(State state) {
		List<City> regionCity = new ArrayList<>();
		for (Region r : state.getState()) {
			for (Area a : r.getRegion()) {
				for (City c : a.getArea()) {
					if (c.isRegionCity() == true) {
						regionCity.add(c);

					}
				}
			}
		}
		return regionCity;
	}
	
	public static City isCapital(State state) {
		City capital = null;
		for (Region r : state.getState()) {
			for (Area a : r.getRegion()) {
				for (City c : a.getArea()) {
					if (c.isCapital() == true) {
						capital = c;

					}
				}
			}
		}
		return capital;
	}

	static int countRegion(List<Region> state) {
		return state.size();
	}
}
