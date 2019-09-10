package by.htp.part02.block9.ex3;

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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((areaName == null) ? 0 : areaName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Area other = (Area) obj;
		if (area == null) {
			if (other.area != null) {
				return false;
			}
		} else if (!area.equals(other.area)) {
			return false;
		}
		if (areaName == null) {
			if (other.areaName != null) {
				return false;
			}
		} else if (!areaName.equals(other.areaName)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Area [areaName=" + areaName + ", area=" + area + "]";
	}

}
