package ie.tippinst.jod.ws.model;

import java.util.Date;

public class Weather {
	
	private Date date;
	private double temperature;
	private int windSpeed;
	
	public Weather() {
		super();
	}

	public Weather(double temperature) {
		super();
		this.temperature = temperature;
	}
	
	public Weather(double temperature, int windSpeed) {
		super();
		this.temperature = temperature;
		this.windSpeed = windSpeed;
	}

	public Weather(Date date, double temperature) {
		super();
		this.date = date;
		this.temperature = temperature;
	}
	
	public Weather(Date date, double temperature, int windSpeed) {
		super();
		this.date = date;
		this.temperature = temperature;
		this.windSpeed = windSpeed;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}
}
