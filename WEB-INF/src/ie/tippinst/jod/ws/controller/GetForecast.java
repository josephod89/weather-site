package ie.tippinst.jod.ws.controller;
import ie.tippinst.jod.ws.model.Weather;
import ie.tippinst.jod.ws.model.WeatherForecastGenerator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GetForecast extends HttpServlet {
	
	WeatherForecastGenerator wfg;
	Weather weather;
	
	public void init(){
		wfg = new WeatherForecastGenerator();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//get weather forecast
		weather = wfg.getForecast();
		//add weather object to session
		HttpSession session = request.getSession();
		session.setAttribute("weather", weather);
		response.sendRedirect("./forecast.jsp");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
