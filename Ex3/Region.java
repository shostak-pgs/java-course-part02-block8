package by.htp.part02.block9.Ex3;

import java.util.List;

public class Region {

	private String regName;
	private List<Area> region;

	public Region(String regName, List<Area> region) {
		this.setRegName(regName);
		this.setRegion(region);
	}

	public String getRegName() {
		return regName;
	}

	public void setRegName(String regName) {
		this.regName = regName;
	}

	public List<Area> getRegion() {
		return region;
	}

	public void setRegion(List<Area> region) {
		this.region = region;
	}
}
