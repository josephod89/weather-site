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
			<a class="button" href="home.html">Home</a>
			<a class="button" href="about.html">About</a>
			<a class="button" href="contact.html">Contact</a>
		</div>
		<div class="bl">
			<div class="br">
				<div class="tl">
					<div class="tr">
						<table cellpadding="15">
							<tr>
								<td>
									<h3>Today - 20 Feb 2011</h3>
									<p class="main_text">
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
		<div class="subpanel1">
			<table cellspacing="10">
				<tr>
					<td>
						<h3>Tasty Stuff</h3>
					</td>
				</tr>
				<tr>
					<td>
						<p class="main_text">Lorem ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, scrambled it to make a type specimen book.</p>
					</td>
				</tr>
			</table>
		</div>
		<div class="subpanel2">
			<table cellspacing="10">
				<tr>
					<td>
						<h3>Biggest Hits</h3>
					</td>
				</tr>
				<tr>
					<td>
						<p class="main_text">Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia.</p>
					</td>
				</tr>
			</table>
		</div>
		<div class="subpanel3">
			<table cellspacing="10">
				<tr>
					<td>
						<h3>News</h3>
					</td>
				</tr>
				<tr>
					<td>
						<p class="main_text">If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text.</p>
					</td>
				</tr>
			</table>
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