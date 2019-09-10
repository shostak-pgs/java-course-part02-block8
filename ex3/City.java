package by.htp.part02.block9.ex3;

public class City {

	private String cityName;
	private boolean regionCity;
	private boolean capital = false;

	public City(String cityName, boolean regionCity, boolean capital) {
		this.cityName = cityName;
		this.setRegionCity(regionCity);
		this.capital = capital;
	}

	public boolean isCapital() {
		return capital;
	}

	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	public void setName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityName() {
		return cityName;
	}

	public boolean isRegionCity() {
		return regionCity;
	}

	public void setRegionCity(boolean regionCity) {
		this.regionCity = regionCity;
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
		City other = (City) obj;
		if (cityName == null) {
			if (other.cityName != null) {
				return false;
			}
		} else if (!cityName.equals(other.cityName)) {
			return false;
		}
		if (regionCity != other.regionCity) {
			return false;
		}
		if (capital != other.capital) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
		result = prime * result + (regionCity ? 1231 : 1237);
		result = prime * result + (capital ? 1231 : 1237);
		return result;
	}
	
	@Override
	public String toString() {
		return "cityName=" + cityName + ", isRegionCity=" + regionCity+ ", isCapital=" + capital;
	}
}
