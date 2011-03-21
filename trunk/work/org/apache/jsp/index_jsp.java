package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("\t\t\t<a class=\"button\" href=\"./index.jsp\">Home</a>\r\n");
      out.write("\t\t\t<a class=\"button\" href=\"about.html\">Current Readings</a>\r\n");
      out.write("\t\t\t<a class=\"button\" href=\"./getForecast\">Forecast</a>\r\n");
      out.write("\t\t\t<a class=\"button\" href=\"contact.html\">Subscribe</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"bl\">\r\n");
      out.write("\t\t\t<div class=\"br\">\r\n");
      out.write("\t\t\t\t<div class=\"tl\">\r\n");
      out.write("\t\t\t\t\t<div class=\"tr\">\r\n");
      out.write("\t\t\t\t\t\t<table cellpadding=\"15\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Today</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"main_text\">\r\n");
      out.write("\t");

		ie.tippinst.jod.ws.model.Weather weather = (ie.tippinst.jod.ws.model.Weather) session.getAttribute("overnightWeather");
		out.println("Overnight: ");
		out.println(weather);
	
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("\t");

		weather = (ie.tippinst.jod.ws.model.Weather) session.getAttribute("morningWeather");
		out.println("Morning: ");
		out.println(weather);
	
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("\t");

		weather = (ie.tippinst.jod.ws.model.Weather) session.getAttribute("afternoonWeather");
		out.println("Afternoon: ");
		out.println(weather);
	
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("\t");

		weather = (ie.tippinst.jod.ws.model.Weather) session.getAttribute("eveningWeather");
		out.println("Evening: ");
		out.println(weather);
	
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
      out.write("\t\t<div class=\"bottom_links\">\r\n");
      out.write("\t\t\t<a class=\"bottom\" href=\"home.html\">Home</a>\r\n");
      out.write("\t\t\t<a class=\"bottom\" href=\"about.html\">About</a>\r\n");
      out.write("\t\t\t<a class=\"bottom\" href=\"contact.html\">Contact</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"bottom_message\">\r\n");
      out.write("\t\t\t<p class=\"bottom\">Weather Forecasting by Joseph O'Donoghue</p>\r\n");
      out.write("\t\t</div>\r\n");
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
