package by.htp.part02.block9.Ex3;

import java.util.List;

/*
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры. 
 */
public class State {

	private String name;
	private String capital;
	private List<Region> state;
	private double square;

	public State(String name, String capital, List<Region> state, double square) {
		this.setName(name);
		this.setCapital(capital);
		this.setState(state);
		this.setSquare(square);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public List<Region> getState() {
		return state;
	}

	public void setState(List<Region> state) {
		this.state = state;
	}

	public double getSquare() {
		return square;
	}

	public void setSquare(double square) {
		this.square = square;
	}

	public void addRegion(List<Region> state) {
		for (Region r : state) {
			this.state.add(r);
		}
	}

	void countRegion(List<Region> state) {
		System.out.println("Количество областей = " + state.size());
	}
}
