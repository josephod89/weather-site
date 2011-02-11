<html>
	<head>
		<title>Weather Forecast</title>
	</head>
	<h1>Weather Forecast</h1>
	<%
		ie.tippinst.jod.ws.model.Weather weather = (ie.tippinst.jod.ws.model.Weather) session.getAttribute("weather");
		out.println(weather.getTemperature() + " Celsius");
	%>
	</body>
</html>