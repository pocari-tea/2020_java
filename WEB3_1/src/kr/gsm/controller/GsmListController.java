package kr.gsm.controller;

import java.io.IOException;import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.gsm.model.MemDAO;
import kr.gsm.model.MemVO;

@WebServlet("/gsmList.do")
public class GsmListController extends HttpServlet {
   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      MemDAO dao=new MemDAO();
      List<MemVO> list=dao.MemAllList();
      // View --> JSP	
       request.setAttribute("list", list);
       RequestDispatcher rd=request.getRequestDispatcher("gsmlist.jsp");
       rd.forward(request, response);
   }
}
