import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloServlet extends HttpServlet{				 
	public void service(HttpServletRequest request,HttpServletResponse  response) throws ServletException, IOException{
		// 클라이언트가 요청을 하면 HelloServlet 문자열을 응답해보자
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("3118_정훈_HelloServlet");
		out.println("</body>");
		out.println("</html>");
	}
}
