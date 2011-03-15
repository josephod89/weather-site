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
      out.write("\t\t<title>Weather Forecast</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<h1>Weather Forecast</h1>\r\n");
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
      out.write("\t<br />\r\n");
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
