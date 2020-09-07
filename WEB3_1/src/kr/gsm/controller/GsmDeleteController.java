package kr.gsm.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.gsm.model.MemDAO;

/**
 * Servlet implementation class GsmDeleteController
 */
@WebServlet("/gsmdelete.do")
public class GsmDeleteController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		MemDAO dao = new MemDAO();
		int cnt = dao.MemDelete(id);
		
		if(cnt > 0){
			response.sendRedirect("gsmList.do");
		}else {
			throw new ServletException("delete error");
		}
	}
}
