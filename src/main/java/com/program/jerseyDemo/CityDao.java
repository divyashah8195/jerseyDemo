package com.program.jerseyDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CityDao {

	List<City> cities;

	/*public CityDao() {

		cities = new ArrayList<>();

		City city = new City(101, "indore");
		City city1 = new City(102, "banglore");
		City city2 = new City(103, "Texas");

		cities.addAll(Arrays.asList(city, city1, city2));

	}*/

	
	 // public List<City> getAllCity() { return cities; }
	 

	public City getCityById(int cityId) {

		return cities.stream().filter(x -> x.getCityId() == cityId).collect(Collectors.toList()).get(0);
	}

	public List<City> getAllCity() throws SQLException {
		ResultSet rs = getConnection().createStatement().executeQuery("select * from city");
		while (rs.next()) {
			City c = new City();
			c.setCityName(rs.getString("Banglore"));
			cities.add(c);
		}
		return cities;
	}

	public Connection getConnection() throws SQLException {

		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/join", "root", "root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}

}
