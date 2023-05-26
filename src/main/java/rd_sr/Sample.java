package rd_sr;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sample")
public class Sample extends HttpServlet
{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.getRequestDispatcher("MyHtml.html").forward(req,res);
//		res.getWriter().print("<h1>This is Sample Servlet</h1>");
		
//		res.sendRedirect("https://www.youtube.com");
		
//		req.getRequestDispatcher("MyHtml.html").include(req, res);
		
	}
   
}
