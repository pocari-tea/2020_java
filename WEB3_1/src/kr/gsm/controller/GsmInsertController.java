package kr.gsm.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.gsm.model.MemDAO;
import kr.gsm.model.MemVO;

/**
 * Servlet implementation class GsmInsertController
 */
@WebServlet("/gsminsert.do")
public class GsmInsertController extends HttpServlet {
   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String id=request.getParameter("id");
       String pwd=request.getParameter("pwd");       
       int age=Integer.parseInt(request.getParameter("age"));
       
       MemVO vo=new MemVO(id, pwd, age);
       MemDAO dao=new MemDAO();
       int cnt=dao.MemInsert(vo);
       if(cnt>0) {
          // ����->����Ʈ�������� ����(��ȯ)
          response.sendRedirect("gsmList.do");
       }else {
          throw new ServletException("������");
       }
   }

}
