package vn.codegym.customerlist;

import vn.codegym.customerlist.dto.Customer;
import vn.codegym.customerlist.model.CustomerModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "customer", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/customer.jsp");
        List<Customer> customerList = new CustomerModel().getCustomerList();
        req.setAttribute("customerList", customerList);
        requestDispatcher.forward(req, resp);

    }
}
