package by.htp.part02.block9.ex3;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((regName == null) ? 0 : regName.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
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
		Region other = (Region) obj;
		if (regName == null) {
			if (other.regName != null) {
				return false;
			}
		} else if (!regName.equals(other.regName)) {
			return false;
		}
		if (region == null) {
			if (other.region != null) {
				return false;
			}
		} else if (!region.equals(other.region)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Region [regName=" + regName + ", region=" + region + "]";
	}
}
