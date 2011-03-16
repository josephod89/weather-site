package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forecast_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

		
				
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
	
  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Weather Site</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"design.css\" />\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t<!--<a href =\"home.html\"><img src=\"../images/logo.png\" alt=\"Logo\" /></a>-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"menu\">\r\n");
      out.write("\t\t\t<a class=\"button\" href=\"home.html\">Home</a>\r\n");
      out.write("\t\t\t<a class=\"button\" href=\"about.html\">About</a>\r\n");
      out.write("\t\t\t<a class=\"button\" href=\"contact.html\">Contact</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"bl\">\r\n");
      out.write("\t\t\t<div class=\"br\">\r\n");
      out.write("\t\t\t\t<div class=\"tl\">\r\n");
      out.write("\t\t\t\t\t<div class=\"tr\">\r\n");
      out.write("\t\t\t\t\t\t<table cellpadding=\"15\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Today - 20 Feb 2011</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"main_text\">\r\n");
      out.write("\t");

		ie.tippinst.jod.ws.model.Weather weather = (ie.tippinst.jod.ws.model.Weather) session.getAttribute("overnightWeather");
		out.println("Overnight: ");
		out.println(displayInfo(weather));
	
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("\t");

		weather = (ie.tippinst.jod.ws.model.Weather) session.getAttribute("morningWeather");
		out.println("Morning: ");
		out.println(displayInfo(weather));
	
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("\t");

		weather = (ie.tippinst.jod.ws.model.Weather) session.getAttribute("afternoonWeather");
		out.println("Afternoon: ");
		out.println(displayInfo(weather));
	
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("\t");

		weather = (ie.tippinst.jod.ws.model.Weather) session.getAttribute("eveningWeather");
		out.println("Evening: ");
		out.println(displayInfo(weather));
	
      out.write("\r\n");
      out.write("\t<br /></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/8615314-sun.jpg\" alt=\"A screenshot\" width=\"350\" height=\"200\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"subpanel1\">\r\n");
      out.write("\t\t\t<table cellspacing=\"10\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<h3>Tasty Stuff</h3>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"main_text\">Lorem ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, scrambled it to make a type specimen book.</p>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"subpanel2\">\r\n");
      out.write("\t\t\t<table cellspacing=\"10\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<h3>Biggest Hits</h3>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"main_text\">Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia.</p>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"subpanel3\">\r\n");
      out.write("\t\t\t<table cellspacing=\"10\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<h3>News</h3>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"main_text\">If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text.</p>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"bottom_links\">\r\n");
      out.write("\t\t\t<a class=\"bottom\" href=\"home.html\">Home</a>\r\n");
      out.write("\t\t\t<a class=\"bottom\" href=\"about.html\">About</a>\r\n");
      out.write("\t\t\t<a class=\"bottom\" href=\"contact.html\">Contact</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"bottom_message\">\r\n");
      out.write("\t\t\t<p class=\"bottom\">Weather Forecasting by Joseph O'Donoghue</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
