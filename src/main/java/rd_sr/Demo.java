package rd_sr;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/demo")
public class Demo  extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		req.getRequestDispatcher("sample").forward(req, res);
		
//		res.setContentType("text/html");
//		res.getWriter().print("hello this is demo");
		
//		req.getRequestDispatcher("MyHtml.html").include(req, res);
//		req.getRequestDispatcher("index.jsp").include(req, res);
		
	}
	
	
}
