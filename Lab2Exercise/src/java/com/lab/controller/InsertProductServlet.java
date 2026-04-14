import com.lab.dao.ProductDAO;
import com.lab.model.Product;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert")
public class InsertProductServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String category = request.getParameter("category");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        Product product = new Product(0, name, category, price, quantity);

        ProductDAO dao = new ProductDAO();
        try {
            dao.insertProduct(product);
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("list");
    }
}