package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.lab.model.Product;

public final class view_005fproducts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Product Inventory System</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("    <h1>Product Management</h1>\n");
      out.write("    <h2><a href=\"add_product.jsp\">Add New Product</a></h2>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("<div align=\"center\">\n");
      out.write("    <table border=\"1\" cellpadding=\"5\">\n");
      out.write("        <caption><h2>List of Products</h2></caption>\n");
      out.write("        <tr>\n");
      out.write("            <th>ID</th>\n");
      out.write("            <th>Name</th>\n");
      out.write("            <th>Category</th>\n");
      out.write("            <th>Price</th>\n");
      out.write("            <th>Quantity</th>\n");
      out.write("            <th>Actions</th>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        ");

            List<Product> listProduct = (List<Product>) request.getAttribute("listProduct");
            if (listProduct != null) {
                for (Product product : listProduct) {
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( product.getId() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( product.getName() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( product.getCategory() );
      out.write("</td>\n");
      out.write("            <td>$");
      out.print( product.getPrice() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( product.getQuantity() );
      out.write("</td>\n");
      out.write("            <td>\n");
      out.write("                <a href=\"edit?id=");
      out.print( product.getId() );
      out.write("\">Edit</a>\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                <a href=\"delete?id=");
      out.print( product.getId() );
      out.write("\" \n");
      out.write("                   onclick=\"return confirm('Are you sure you want to delete this product?')\">\n");
      out.write("                   Delete\n");
      out.write("                </a>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        ");

                }
            }
        
      out.write("\n");
      out.write("\n");
      out.write("    </table>\n");
      out.write("</div>\n");
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
