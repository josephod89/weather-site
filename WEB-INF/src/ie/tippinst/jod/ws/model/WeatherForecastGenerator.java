package ie.tippinst.jod.ws.model;

import java.io.IOException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;


public class WeatherForecastGenerator {
	
	private Weather weather;
	
	public WeatherForecastGenerator(){
		this.weather = new Weather();
	}	
	
	public Weather getForecast(int period){
		Calendar cal = Calendar.getInstance();
		switch(period){
			case 0:	this.weather = calculateForecast(cal.getTime(), "0:30", "9:30");
					break;
			case 1:	this.weather = calculateForecast(cal.getTime(), "9:30", "13:30");
					break;
			case 2:	this.weather = calculateForecast(cal.getTime(), "13:30", "20:30");
					break;
			case 3:	this.weather = calculateForecast(cal.getTime(), "20:30", "0:00");
					break;
			case 4:	cal.add(Calendar.DATE, 1);
					this.weather = calculateForecast(cal.getTime(), "13:30", "20:30");
					break;
			case 5:	cal.add(Calendar.DATE, 2);
					this.weather = calculateForecast(cal.getTime(), "13:30", "20:30");
					break;
			case 6:	cal.add(Calendar.DATE, 3);
					this.weather = calculateForecast(cal.getTime(), "13:30", "20:30");
					break;
			default:System.out.println("ERROR");
		}
		return this.weather;
	}
	
	private Weather calculateForecast(Date date, String startTime, String endTime){
		Weather myData = getMyData();
		Weather excelData = getDataFromExcel(date, startTime, endTime);
		Weather forecast = new Weather();
		
		//algorithm to generate weather forecast
		forecast.setDate(excelData.getDate());
		forecast.setTemperature(excelData.getTemperature());
		forecast.setWindSpeed(excelData.getWindSpeed());
		forecast.setRainFall(excelData.getRainFall());
		forecast.setPressure(excelData.getPressure());
		
		return forecast;
	}
	
	private Weather getDataFromExcel(Date date, String startTime, String endTime){
		Weather weather = new Weather();
		ReadExcel read = new ReadExcel();
		try {
			//weather.setTemperature(Double.parseDouble(data.read("C:\\Users\\Joseph\\Documents\\Lismore_2010.xls", new Date())));
			Collection<Weather> data = read.read("C:\\Users\\Joseph\\Documents\\Lismore_2010.xls", date, startTime, endTime);
			//Collection<Weather> data = read.read("C:\\Users\\Joseph\\Documents\\Lismore_2010.xls", new Date(), "00:30", "09:30");
			Iterator<Weather> i = data.iterator();
			double totalTemp = 0.0;
			int totalWindSpeed = 0;
			double totalRainFall = 0.0;
			double totalPressure = 0.0;
			while(i.hasNext()){
				Weather w = i.next();
				totalTemp += w.getTemperature();
				totalWindSpeed += w.getWindSpeed();
				totalRainFall += w.getRainFall();
				totalPressure += w.getPressure();
			}
			weather.setDate(date);
			//System.out.println(data.size());
			weather.setTemperature(Math.round(totalTemp / data.size()));
			weather.setWindSpeed(totalWindSpeed / data.size());
			weather.setRainFall(totalRainFall);
			weather.setPressure(Math.round(totalPressure / data.size()));
			//System.out.println(weather.getWindSpeed());
			//System.out.println(total);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return weather;
	}
	
	private Weather getMyData(){
		Weather w = new Weather();
		return w;
	}
	
}
