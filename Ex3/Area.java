package by.htp.part02.block9.Ex3;

import java.util.List;

public class Area {

	private String areaName;
	private List<City> area;

	public Area(String areaName, List<City> area) {
		this.setArea(area);
	}

	public List<City> getArea() {
		return area;
	}

	public void setArea(List<City> area) {
		this.area = area;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
}
