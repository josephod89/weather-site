<html>
	<head>
		<title>Weather Site</title>
		<link rel="stylesheet" type="text/css" href="design.css" />
	</head>
	<body>
		<div class="logo">
			<!--<a href ="home.html"><img src="../images/logo.png" alt="Logo" /></a>-->
		</div>
		<div class="menu">
			<a class="button" href="./index.jsp">Home</a>
			<a class="button" href="about.html">Current Readings</a>
			<a class="button" href="./getForecast">Forecast</a>
			<a class="button" href="contact.html">Subscribe</a>
		</div>
		<div class="bl">
			<div class="br">
				<div class="tl">
					<div class="tr">
						<table cellpadding="15">
							<tr>
								<td>
									<h3>Today</h3>
									<p class="main_text">
	<%
		ie.tippinst.jod.ws.model.Weather weather = (ie.tippinst.jod.ws.model.Weather) session.getAttribute("overnightWeather");
		out.println("Overnight: ");
		out.println(weather);
	%>
	<br />
	<%
		weather = (ie.tippinst.jod.ws.model.Weather) session.getAttribute("morningWeather");
		out.println("Morning: ");
		out.println(weather);
	%>
	<br />
	<%
		weather = (ie.tippinst.jod.ws.model.Weather) session.getAttribute("afternoonWeather");
		out.println("Afternoon: ");
		out.println(weather);
	%>
	<br />
	<%
		weather = (ie.tippinst.jod.ws.model.Weather) session.getAttribute("eveningWeather");
		out.println("Evening: ");
		out.println(weather);
	%>
	<br /></p>
								</td>
								<td>
									<img src="images/8615314-sun.jpg" alt="A screenshot" width="350" height="200" />
								</td>
							</tr>
						</table>
					</div>
				</div>
			</div>
		</div>
		<div class="bottom_links">
			<a class="bottom" href="home.html">Home</a>
			<a class="bottom" href="about.html">About</a>
			<a class="bottom" href="contact.html">Contact</a>
		</div>
		<div class="bottom_message">
			<p class="bottom">Weather Forecasting by Joseph O'Donoghue</p>
		</div>
	</body>
</html>