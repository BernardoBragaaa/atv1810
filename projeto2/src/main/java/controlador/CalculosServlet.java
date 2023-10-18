package controlador;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.numero;

@WebServlet("/CalculosServlet")
public class CalculosServlet extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		numero num = new numero();
		num.setA(request.getParameter("a"));
		num.setB(request.getParameter("b"));
		num.setC(request.getParameter("c"));
		
		
		request.getSession().setAttribute("numero", num);
		try {
			response.sendRedirect("home.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
}
