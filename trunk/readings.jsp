<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@taglib uri='/WEB-INF/cewolf.tld' prefix='cewolf' %>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-type" content="text/html;charset=UTF-8" />
		<title>Weather Site - Readings</title>
		<link rel="stylesheet" type="text/css" href="design.css" />
	</head>
	<body>
		<div class="logo">
			<!-- <a href ="home.html"><img src="../images/logo.png" alt="Logo" /></a>-->
		</div>
		<div class="menu">
			<a class="button" href="./index.jsp">Home</a>
			<a class="button" href="./readings.jsp">Readings</a>
			<a class="button" href="./getForecast">Forecast</a>
		</div>
		<div class="main_panel2_background_bl">
			<div class="main_panel2_background_br">
				<div class="main_panel2_background_tl">
					<div class="main_panel2_background_tr">
						&nbsp;
						<div class="main_panel2a">
							<h3>&nbsp;&nbsp;About me</h3>
							<table cellpadding="3">
								<tr>
									<td>
										<jsp:useBean id="weatherData" class="ie.tippinst.jod.ws.model.WeatherDataGraph"/>
										<cewolf:chart 
										    id="line" 
										    title="Weather Data" 
										    type="line" 
										    xaxislabel="Day" 
										    yaxislabel="Reading">
										    <cewolf:data>
										        <cewolf:producer id="weatherData"/>
										    </cewolf:data>
										</cewolf:chart>
										<cewolf:img chartid="line" renderer="cewolf" width="400" height="300"/>
										<!-- <img src="../images/about_me.jpg" alt="About me" />-->
									</td>
									<!-- td>
										<p class="main_text">Lorem ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, scrambled it to make a type specimen book. Lorem ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, scrambled it to make a type specimen book.</p>
									</td>-->
								</tr>
							</table>
							<!--<p class="main_text">Lorem ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, scrambled it to make a type specimen book. Lorem ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, scrambled it to make a type specimen book.</p>
							<p class="main_text">Lorem ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, scrambled it to make a type specimen book. Lorem ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, scrambled it to make a type specimen book.</p>
						--></div>
						<div class="main_panel2b">
							<h3>Other Information</h3>
							<p class="main_text_highlighted">There are many variations of passages</p>
							<p class="main_text">You are going to use a passage of Lorem ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text.</p>
							<br />
							<p class="main_text_highlighted">Internet tend to repeat predefined chunks</p>
							<p class="main_text">Lorem ipsum which looks reasonable. The generated Lorem ipsum is therefore always free from repetition, injected humour, or non-</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="bottom_links">
			<a class="bottom" href="./index.jsp">Home</a>
			<a class="bottom" href="./readings.jsp">Readings</a>
			<a class="bottom" href="./getForecast">Forecast</a>
		</div>
		<div class="bottom_message">
			<p class="bottom">Weather Forecasting by Joseph O'Donoghue</p>
		</div>
	</body>
</html>