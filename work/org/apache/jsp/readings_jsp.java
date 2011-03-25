package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class readings_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/cewolf.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_cewolf_chart_yaxislabel_xaxislabel_type_title_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_cewolf_data;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_cewolf_producer_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_cewolf_img_width_renderer_height_chartid;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_cewolf_chart_yaxislabel_xaxislabel_type_title_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_cewolf_data = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_cewolf_producer_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_cewolf_img_width_renderer_height_chartid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_cewolf_chart_yaxislabel_xaxislabel_type_title_id.release();
    _jspx_tagPool_cewolf_data.release();
    _jspx_tagPool_cewolf_producer_id.release();
    _jspx_tagPool_cewolf_img_width_renderer_height_chartid.release();
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-type\" content=\"text/html;charset=UTF-8\" />\r\n");
      out.write("\t\t<title>Weather Site - Readings</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"design.css\" />\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t<!-- <a href =\"home.html\"><img src=\"../images/logo.png\" alt=\"Logo\" /></a>-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"menu\">\r\n");
      out.write("\t\t\t<a class=\"button\" href=\"./index.jsp\">Home</a>\r\n");
      out.write("\t\t\t<a class=\"button\" href=\"./readings.jsp\">Readings</a>\r\n");
      out.write("\t\t\t<a class=\"button\" href=\"./getForecast\">Forecast</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"main_panel2_background_bl\">\r\n");
      out.write("\t\t\t<div class=\"main_panel2_background_br\">\r\n");
      out.write("\t\t\t\t<div class=\"main_panel2_background_tl\">\r\n");
      out.write("\t\t\t\t\t<div class=\"main_panel2_background_tr\">\r\n");
      out.write("\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<div class=\"main_panel2a\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>&nbsp;&nbsp;About me</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<table cellpadding=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      ie.tippinst.jod.ws.model.WeatherDataGraph weatherData = null;
      synchronized (_jspx_page_context) {
        weatherData = (ie.tippinst.jod.ws.model.WeatherDataGraph) _jspx_page_context.getAttribute("weatherData", PageContext.PAGE_SCOPE);
        if (weatherData == null){
          weatherData = new ie.tippinst.jod.ws.model.WeatherDataGraph();
          _jspx_page_context.setAttribute("weatherData", weatherData, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_cewolf_chart_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_cewolf_img_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- <img src=\"../images/about_me.jpg\" alt=\"About me\" />-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"main_text\">Lorem ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, scrambled it to make a type specimen book. Lorem ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, scrambled it to make a type specimen book.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t<!--<p class=\"main_text\">Lorem ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, scrambled it to make a type specimen book. Lorem ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, scrambled it to make a type specimen book.</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"main_text\">Lorem ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, scrambled it to make a type specimen book. Lorem ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, scrambled it to make a type specimen book.</p>\r\n");
      out.write("\t\t\t\t\t\t--></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"main_panel2b\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Other Information</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"main_text_highlighted\">There are many variations of passages</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"main_text\">You are going to use a passage of Lorem ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text.</p>\r\n");
      out.write("\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"main_text_highlighted\">Internet tend to repeat predefined chunks</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"main_text\">Lorem ipsum which looks reasonable. The generated Lorem ipsum is therefore always free from repetition, injected humour, or non-</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"bottom_links\">\r\n");
      out.write("\t\t\t<a class=\"bottom\" href=\"./index.jsp\">Home</a>\r\n");
      out.write("\t\t\t<a class=\"bottom\" href=\"./readings.jsp\">Readings</a>\r\n");
      out.write("\t\t\t<a class=\"bottom\" href=\"./getForecast\">Forecast</a>\r\n");
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

  private boolean _jspx_meth_cewolf_chart_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  cewolf:chart
    de.laures.cewolf.taglib.tags.SimpleChartTag _jspx_th_cewolf_chart_0 = (de.laures.cewolf.taglib.tags.SimpleChartTag) _jspx_tagPool_cewolf_chart_yaxislabel_xaxislabel_type_title_id.get(de.laures.cewolf.taglib.tags.SimpleChartTag.class);
    _jspx_th_cewolf_chart_0.setPageContext(_jspx_page_context);
    _jspx_th_cewolf_chart_0.setParent(null);
    _jspx_th_cewolf_chart_0.setId("line");
    _jspx_th_cewolf_chart_0.setTitle("Weather Data");
    _jspx_th_cewolf_chart_0.setType("line");
    _jspx_th_cewolf_chart_0.setXaxislabel("Day");
    _jspx_th_cewolf_chart_0.setYaxislabel("Reading");
    int _jspx_eval_cewolf_chart_0 = _jspx_th_cewolf_chart_0.doStartTag();
    if (_jspx_eval_cewolf_chart_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t    ");
        if (_jspx_meth_cewolf_data_0(_jspx_th_cewolf_chart_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_cewolf_chart_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_cewolf_chart_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_cewolf_chart_yaxislabel_xaxislabel_type_title_id.reuse(_jspx_th_cewolf_chart_0);
    return false;
  }

  private boolean _jspx_meth_cewolf_data_0(javax.servlet.jsp.tagext.JspTag _jspx_th_cewolf_chart_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  cewolf:data
    de.laures.cewolf.taglib.tags.DataTag _jspx_th_cewolf_data_0 = (de.laures.cewolf.taglib.tags.DataTag) _jspx_tagPool_cewolf_data.get(de.laures.cewolf.taglib.tags.DataTag.class);
    _jspx_th_cewolf_data_0.setPageContext(_jspx_page_context);
    _jspx_th_cewolf_data_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cewolf_chart_0);
    int _jspx_eval_cewolf_data_0 = _jspx_th_cewolf_data_0.doStartTag();
    if (_jspx_eval_cewolf_data_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t        ");
        if (_jspx_meth_cewolf_producer_0(_jspx_th_cewolf_data_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t    ");
        int evalDoAfterBody = _jspx_th_cewolf_data_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_cewolf_data_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_cewolf_data.reuse(_jspx_th_cewolf_data_0);
    return false;
  }

  private boolean _jspx_meth_cewolf_producer_0(javax.servlet.jsp.tagext.JspTag _jspx_th_cewolf_data_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  cewolf:producer
    de.laures.cewolf.taglib.tags.ProducerTag _jspx_th_cewolf_producer_0 = (de.laures.cewolf.taglib.tags.ProducerTag) _jspx_tagPool_cewolf_producer_id.get(de.laures.cewolf.taglib.tags.ProducerTag.class);
    _jspx_th_cewolf_producer_0.setPageContext(_jspx_page_context);
    _jspx_th_cewolf_producer_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cewolf_data_0);
    _jspx_th_cewolf_producer_0.setId("weatherData");
    int _jspx_eval_cewolf_producer_0 = _jspx_th_cewolf_producer_0.doStartTag();
    if (_jspx_th_cewolf_producer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_cewolf_producer_id.reuse(_jspx_th_cewolf_producer_0);
    return false;
  }

  private boolean _jspx_meth_cewolf_img_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  cewolf:img
    de.laures.cewolf.taglib.tags.ChartImgTag _jspx_th_cewolf_img_0 = (de.laures.cewolf.taglib.tags.ChartImgTag) _jspx_tagPool_cewolf_img_width_renderer_height_chartid.get(de.laures.cewolf.taglib.tags.ChartImgTag.class);
    _jspx_th_cewolf_img_0.setPageContext(_jspx_page_context);
    _jspx_th_cewolf_img_0.setParent(null);
    _jspx_th_cewolf_img_0.setChartid("line");
    _jspx_th_cewolf_img_0.setRenderer("cewolf");
    _jspx_th_cewolf_img_0.setWidth(400);
    _jspx_th_cewolf_img_0.setHeight(300);
    int _jspx_eval_cewolf_img_0 = _jspx_th_cewolf_img_0.doStartTag();
    if (_jspx_th_cewolf_img_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_cewolf_img_width_renderer_height_chartid.reuse(_jspx_th_cewolf_img_0);
    return false;
  }
}
