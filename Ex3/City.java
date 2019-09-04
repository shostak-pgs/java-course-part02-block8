package by.htp.part02.block9.Ex3;

public class City {

	private String cityName;
	private boolean isRegionCity;

	public City(String cityName, boolean isRegionCity) {
		this.cityName = cityName;
		this.setRegionCity(isRegionCity);
	}

	public void setName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityName() {
		return cityName;
	}

	public boolean isRegionCity() {
		return isRegionCity;
	}

	public void setRegionCity(boolean isRegionCity) {
		this.isRegionCity = isRegionCity;
	}
}
