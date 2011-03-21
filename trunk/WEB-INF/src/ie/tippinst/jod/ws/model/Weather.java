package ie.tippinst.jod.ws.model;

import java.util.Date;

public class Weather {
	
	private Date date;
	private double temperature;
	private int windSpeed;
	private double rainFall;
	private double pressure;
	
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

	public Weather(Date date, double temperature, int windSpeed, double rainFall) {
		super();
		this.date = date;
		this.temperature = temperature;
		this.windSpeed = windSpeed;
		this.rainFall = rainFall;
	}

	public Weather(Date date, double temperature, int windSpeed,
			double rainFall, double pressure) {
		super();
		this.date = date;
		this.temperature = temperature;
		this.windSpeed = windSpeed;
		this.rainFall = rainFall;
		this.pressure = pressure;
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

	public double getRainFall() {
		return rainFall;
	}

	public void setRainFall(double rainFall) {
		this.rainFall = rainFall;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	
	public String toString(){
		String wind = "";
		String temp = "";
		String rain = "";
		
		switch(this.getWindSpeed()){
			case 0:		wind = "no wind"; break;
			case 1:		wind = "very light breeze"; break;
			case 2:		wind = "light breeze"; break;
			case 3:		wind = "gentle breeze"; break;
			case 4:		wind = "moderate breeze"; break;
			case 5:		wind = "fresh breeze"; break;
			case 6:		wind = "strong breeze"; break;
			case 7:		wind = "moderate gale"; break;
			case 8:		wind = "gale"; break;
			case 9:		wind = "strong gale"; break;
			case 10:	wind = "storm"; break;
			case 11:	wind = "violent storm"; break;
			case 12:	wind = "hurricane"; break;
			default:	System.out.println("ERROR");
		}
		
		if(this.getTemperature() > 20.0){
			temp = "hot";
		}
		else if(this.getTemperature() > 15.0){
			temp = "warm";
		}
		else if(this.getTemperature() > 10.0){
			temp = "mild";
		}
		else if(this.getTemperature() > 5.0){
			temp = "cool";
		}
		else if(this.getTemperature() > 0.0){
			temp = "cold";
		}
		else {
			temp = "freezing";
		}
		
		if(this.getRainFall() > 4.0){
			rain = "very wet";
		}
		else if(this.getRainFall() > 1.0){
			rain = "showery";
		}
		else if(this.getRainFall() > 0.5){
			rain = "cloudy with patches of drizzle";
		}
		else {
			rain = "dry";
		}
		
		//return "Temperature: " + (int)this.getTemperature() + "°C " + "Wind speed: " + windSpeed + "mph (" + strength + ")" + " Rain: " + this.getRainFall() + " Pressure: " + this.getPressure();
		return "It will be " + temp + " with an average temperature of " + (int)this.getTemperature() + "°C.  It will also be " + rain + " with a " + wind + ".";
	}
}
