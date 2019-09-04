package by.htp.part02.block9.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		City bobruisk = new City("Бобруйск", false);
		City tugolica = new City("Туголица", false);
		City pinsk = new City("Пинск", false);
		City mogilev = new City("Могилев", true);
		City brest = new City("Брест", true);

		List<City> area = new ArrayList<>();
		area.add(bobruisk);
		area.add(tugolica);
		area.add(mogilev);

		List<City> area1 = new ArrayList<>();
		area1.add(pinsk);
		area1.add(brest);

		Area bobrArea = new Area("Бобруйский район", area);
		Area pinskArea = new Area("Пинский район", area1);

		List<Area> region = new ArrayList<>();
		region.add(bobrArea);

		List<Area> regionP = new ArrayList<>();
		regionP.add(pinskArea);

		Region mogilevR = new Region("Могилевская область", region);

		Region brestR = new Region("Брестская облатсь", regionP);

		List<Region> state = new ArrayList<>();
		state.add(mogilevR);
		state.add(brestR);

		State by = new State("Республика Беларусь", "Минск ", state, 207.59);

		System.out.println("Столица государства - " + by.getCapital());

		by.countRegion(state);

		System.out.println("Площадь государства = " + by.getSquare() + " км2");

		ArrayList<City> regionCity = (ArrayList<City>) isRegionCity(by);
		for (City c : regionCity) {
			System.out.println("Областной центр - " + c.getCityName());
		}

	}

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
}
