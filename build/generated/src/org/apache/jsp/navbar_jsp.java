package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");


    String url = request.getRequestURI();
    request.setAttribute("url", url);
    
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\"> Gist News .....</a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("       <ul class=\"navbar-nav ml-auto\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <input type=\"text\" name=\"keyword\" id=\"keyword\" placeholder=\"Enter Keyword \"/> \n");
      out.write("              <button id=\"search\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("              <span class=\"sr-only\">(current)</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("       </ul>\n");
      out.write("              \n");
      out.write("      \n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url.contains(\"index.jsp\")?\" active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" href=\"index.jsp\"> <i class=\"fa fa-home\"></i> Home\n");
      out.write("              <span class=\"sr-only\">(current)</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\"> About</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\">Services</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url.contains(\"contact.jsp\")?\" active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" href=\"contact.jsp\">Contact</a>\n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"login.jsp\"> <i class=\"fa fa-lock\"></i> &nbsp;&nbsp;Login</a>\n");
      out.write("          </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"login.jsp\"> <i class=\"fa fa-lock\"></i> &nbsp;&nbsp;Register</a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>    ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
