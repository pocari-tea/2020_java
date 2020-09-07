package kr.gsm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.gsm.model.MyUtil;

@WebServlet("/list.do")
public class MemberListController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		// Controller(Servlet)
		// 1. Ŭ���̾�Ʈ�� ��û�� ���� �����޴� ����
		int su1 = Integer.parseInt(request.getParameter("su1"));
		int su2 = Integer.parseInt(request.getParameter("su2"));
		
		// 2. Model�� ������ �Ѵ�
		MyUtil my = new MyUtil();
		int result = my.toSum(su1, su2);
		// 3. ��û Ŭ���̾�Ʈ�� �����ϴ� �ڵ�
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("3118_����:" + result);
		out.println("</body>");
		out.println("</html>");
	}
}
