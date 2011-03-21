package ie.tippinst.jod.ws.controller;
import ie.tippinst.jod.ws.model.Weather;
import ie.tippinst.jod.ws.model.WeatherForecastGenerator;

import java.io.IOException;
import java.io.PrintStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sun.net.smtp.SmtpClient;

public class GetForecast extends HttpServlet {
	
	WeatherForecastGenerator wfg;
	Weather overnightWeather;
	Weather morningWeather;
	Weather afternoonWeather;
	Weather eveningWeather;
	
	public void init(){
		wfg = new WeatherForecastGenerator();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//get weather forecast
		overnightWeather = wfg.getForecast(0);
		morningWeather = wfg.getForecast(1);
		afternoonWeather = wfg.getForecast(2);
		eveningWeather = wfg.getForecast(3);
		//add weather object to session
		HttpSession session = request.getSession();
		session.setAttribute("overnightWeather", overnightWeather);
		session.setAttribute("morningWeather", morningWeather);
		session.setAttribute("afternoonWeather", afternoonWeather);
		session.setAttribute("eveningWeather", eveningWeather);
		response.sendRedirect("./forecast.jsp");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
