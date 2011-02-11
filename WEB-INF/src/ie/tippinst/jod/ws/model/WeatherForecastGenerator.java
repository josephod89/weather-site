package ie.tippinst.jod.ws.model;

import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;


public class WeatherForecastGenerator {
	
	private Weather weather;
	
	public WeatherForecastGenerator(){
		this.weather = new Weather();
	}	
	
	public Weather getForecast(){
		this.weather = calculateForecast();
		return this.weather;
	}
	
	private Weather calculateForecast(){
		Weather myData = getMyData();
		Weather excelData = getDataFromExcel();
		Weather forecast = new Weather();
		
		//algorithm to generate weather forecast
		forecast.setTemperature(excelData.getTemperature());
		
		return forecast;
	}
	
	private Weather getDataFromExcel(){
		Weather weather = new Weather();
		ReadExcel read = new ReadExcel();
		try {
			//weather.setTemperature(Double.parseDouble(data.read("C:\\Users\\Joseph\\Documents\\Lismore_2010.xls", new Date())));
			Collection<Weather> data = read.read("C:\\Users\\Joseph\\Documents\\Lismore_2010.xls", new Date());
			Iterator<Weather> i = data.iterator();
			double total = 0.0;
			while(i.hasNext()){
				Weather w = i.next();
				total += w.getTemperature();
			}
			weather.setDate(new Date());
			weather.setTemperature(total / data.size());
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
