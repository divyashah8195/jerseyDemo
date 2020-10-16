package com.program.jerseyDemo;

public class City {

	
	private int cityId;
	private String cityName;
	
	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public City(int cityId, String cityName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
	}

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
