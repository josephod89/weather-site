package ie.tippinst.jod.ws.model;

import java.util.Date;

public class Weather {
	
	private Date date;
	private double temperature;
	
	public Weather() {
		super();
	}

	public Weather(double temperature) {
		super();
		this.temperature = temperature;
	}

	public Weather(Date date, double temperature) {
		super();
		this.date = date;
		this.temperature = temperature;
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
}
