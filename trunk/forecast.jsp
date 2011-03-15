<html>
	<head>
		<title>Weather Forecast</title>
	</head>
	<h1>Weather Forecast</h1>
	<%
		ie.tippinst.jod.ws.model.Weather weather = (ie.tippinst.jod.ws.model.Weather) session.getAttribute("overnightWeather");
		out.println("Overnight: ");
		out.println(displayInfo(weather));
	%>
	<br />
	<%
		weather = (ie.tippinst.jod.ws.model.Weather) session.getAttribute("morningWeather");
		out.println("Morning: ");
		out.println(displayInfo(weather));
	%>
	<br />
	<%
		weather = (ie.tippinst.jod.ws.model.Weather) session.getAttribute("afternoonWeather");
		out.println("Afternoon: ");
		out.println(displayInfo(weather));
	%>
	<br />
	<%
		weather = (ie.tippinst.jod.ws.model.Weather) session.getAttribute("eveningWeather");
		out.println("Evening: ");
		out.println(displayInfo(weather));
	%>
	<br />
	<%!		
				
		private String displayInfo(ie.tippinst.jod.ws.model.Weather weather){
			int windSpeed = 0;
			String strength = "";
			switch(weather.getWindSpeed()){
				case 0:		windSpeed = 1; strength = "Calm"; break;
				case 1:		windSpeed = 3; strength = "Light air"; break;
				case 2:		windSpeed = 7; strength = "Light breeze"; break;
				case 3:		windSpeed = 12; strength = "Gentle breeze"; break;
				case 4:		windSpeed = 17; strength = "Moderate breeze"; break;
				case 5:		windSpeed = 24; strength = "Fresh breeze"; break;
				case 6:		windSpeed = 30; strength = "Strong breeze"; break;
				case 7:		windSpeed = 38; strength = "Moderate gale"; break;
				case 8:		windSpeed = 46; strength = "Gale"; break;
				case 9:		windSpeed = 54; strength = "Strong gale"; break;
				case 10:	windSpeed = 63; strength = "Storm"; break;
				case 11:	windSpeed = 72; strength = "Violent storm"; break;
				case 12:	windSpeed = 81; strength = "Hurricane"; break;
				default:	System.out.println("ERROR");
			}
			return "Temperature: " + (int)weather.getTemperature() + "°C " + "Wind speed: " + windSpeed + "mph (" + strength + ")";
		}
	%>
	</body>
</html>