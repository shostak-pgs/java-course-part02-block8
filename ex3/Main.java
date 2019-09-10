package by.htp.part02.block9.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		City bobruisk = new City("Бобруйск", false, false);
		City tugolica = new City("Туголица", false, false);
		City pinsk = new City("Пинск", false, false);
		City mogilev = new City("Могилев", true, false);
		City brest = new City("Брест", true, false);
		City minsk = new City("Минск", true, true);
		City borisov = new City("Борисов", false, false);

		List<City> area = new ArrayList<>(Arrays.asList(new City[] {bobruisk, tugolica, mogilev} ));		
		List<City> area1 = new ArrayList<>(Arrays.asList(new City[] {pinsk, brest} ));
		List<City> area2 = new ArrayList<>(Arrays.asList(new City[] {minsk, borisov} ));
		
		Area bobrArea = new Area("Бобруйский район", area);
		Area pinskArea = new Area("Пинский район", area1);
		Area minskArea = new Area("Минский район", area2);

		Region mogilevR = new Region("Могилевская область", new ArrayList<>(Arrays.asList(new Area[] {bobrArea})));
		Region brestR = new Region("Брестская область", new ArrayList<>(Arrays.asList(new Area[] {bobrArea})));
		Region minskR = new Region("Минская область", new ArrayList<>(Arrays.asList(new Area[] {minskArea})));

		State by = new State("Республика Беларусь", new ArrayList<>(Arrays.asList(new Region[] {mogilevR, brestR, minskR})), 207.59);

		System.out.println("Столица государства - " + StateLogic.isCapital(by).getCityName());

		System.out.println("Количество областей = " + StateLogic.countRegion(by.getState()));

		System.out.println("Площадь государства = " + by.getSquare() + " км2");
		
		System.out.println("Областные центры: ");
		print(StateLogic.isRegionCity(by));		
		
	}
	
	public static void print(List<City> list) {
		for (City c : list) {
			System.out.print(c.getCityName() + " ");
		}
	}
	
}
