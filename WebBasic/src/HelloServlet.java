import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloServlet extends HttpServlet{				 
	public void service(HttpServletRequest request,HttpServletResponse  response) throws ServletException, IOException{
		// Ŭ���̾�Ʈ�� ��û�� �ϸ� HelloServlet ���ڿ��� �����غ���
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("3118_����_HelloServlet");
		out.println("</body>");
		out.println("</html>");
	}
}
