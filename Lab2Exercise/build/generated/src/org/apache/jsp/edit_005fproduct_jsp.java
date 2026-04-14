package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.lab.model.Product;

public final class edit_005fproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Edit Product</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");

    Product product = (Product) request.getAttribute("product");
    if (product == null) {

      out.write("\n");
      out.write("    <h2>Error: Product not found</h2>\n");
      out.write("    <a href=\"list\">Back</a>\n");

        return;
    }

      out.write("\n");
      out.write("\n");
      out.write("<h2>Edit Product</h2>\n");
      out.write("\n");
      out.write("<form action=\"update\" method=\"post\">\n");
      out.write("    <input type=\"hidden\" name=\"id\" value=\"");
      out.print( product.getId() );
      out.write("\" />\n");
      out.write("\n");
      out.write("    <table border=\"0\">\n");
      out.write("        <tr>\n");
      out.write("            <td>Product Name:</td>\n");
      out.write("            <td><input type=\"text\" name=\"name\" value=\"");
      out.print( product.getName() );
      out.write("\" required /></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Category:</td>\n");
      out.write("            <td><input type=\"text\" name=\"category\" value=\"");
      out.print( product.getCategory() );
      out.write("\" /></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Price:</td>\n");
      out.write("            <td><input type=\"number\" step=\"0.01\" name=\"price\" value=\"");
      out.print( product.getPrice() );
      out.write("\" required /></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Quantity:</td>\n");
      out.write("            <td><input type=\"number\" name=\"quantity\" value=\"");
      out.print( product.getQuantity() );
      out.write("\" required /></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=\"2\" align=\"center\">\n");
      out.write("                <input type=\"submit\" value=\"Update Product\" />\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<a href=\"list\">Cancel and Go Back</a>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
