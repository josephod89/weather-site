<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<%@page import="ie.tippinst.jod.ws.model.Weather" %>
<%@page import="java.util.Calendar"%>
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
			<a class="button" href="about.html">Readings</a>
			<a class="button" href="./getForecast">Forecast</a>
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
											Weather weather = (Weather) session.getAttribute("overnightWeather");
											out.println("Overnight, i" + weather);
										
										
											weather = (Weather) session.getAttribute("morningWeather");
											out.println("In the morning i" + weather);
										
										
											weather = (Weather) session.getAttribute("afternoonWeather");
											out.println("In the afternoon i" + weather);
										
										
											weather = (Weather) session.getAttribute("eveningWeather");
											out.println("In the evening i" + weather);
										%>
										
										</p>
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
						<h3>Tomorrow</h3>
					</td>
				</tr>
				<tr>
					<td>
						<p class="main_text">
						<% 
							weather = (Weather) session.getAttribute("day2");
							out.println("I" + weather);
						%>
					</p>
					</td>
				</tr>
			</table>
		</div>
		<div class="subpanel2">
			<table cellspacing="10">
				<tr>
					<td>
						<h3><% 
							weather = (Weather) session.getAttribute("day3");
							String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
							Calendar cal = Calendar.getInstance();
							cal.setTime(weather.getDate());
							out.println(days[cal.get(Calendar.DAY_OF_WEEK) - 1]);
						%></h3>
					</td>
				</tr>
				<tr>
					<td>
						<p class="main_text">
						<% 
							out.println("I" + weather);
						%></p>
					</td>
				</tr>
			</table>
		</div>
		<div class="subpanel3">
			<table cellspacing="10">
				<tr>
					<td>
						<h3><%
							weather = (Weather) session.getAttribute("day4");
							cal.setTime(weather.getDate());
							out.println(days[cal.get(Calendar.DAY_OF_WEEK) - 1]);
							%>
						</h3>
					</td>
				</tr>
				<tr>
					<td>
						<p class="main_text"><% 
							out.println("I" + weather);
						%></p>
					</td>
				</tr>
			</table>
		</div>
		<div class="bottom_links">
			<a class="bottom" href="./index.jsp">Home</a>
			<a class="bottom" href="about.html">Readings</a>
			<a class="bottom" href="./getForecast">Forecast</a>
		</div>
		<div class="bottom_message">
			<p class="bottom">Weather Forecasting by Joseph O'Donoghue</p>
		</div>
	</body>
</html>