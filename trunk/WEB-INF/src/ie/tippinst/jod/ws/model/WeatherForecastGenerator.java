package ie.tippinst.jod.ws.model;

import java.io.IOException;


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
		Weather w = new Weather();
		ReadExcel test = new ReadExcel();
		test.setInputFile("C:\\Users\\Joseph\\Documents\\Lismore_2010.xls");
		try {
			w.setTemperature(Double.parseDouble(test.read()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return w;
	}
	
	private Weather getMyData(){
		Weather w = new Weather();
		return w;
	}
	
}
