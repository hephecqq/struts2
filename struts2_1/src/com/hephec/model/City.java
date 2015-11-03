package com.hephec.model;

public class City {
	public City() {
		// TODO Auto-generated constructor stub
	}
	public City(String id,String name){
		this.CityId=id;
		this.CityName=name;
	}
	private String CityId;
	private String CityName;
	public String getCityId() {
		return CityId;
	}
	public void setCityId(String cityId) {
		CityId = cityId;
	}
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	@Override
	public String toString() {
		return "City [CityId=" + CityId + ", CityName=" + CityName + "]";
	}
	
	
}
