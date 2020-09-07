package kr.gsm.controller;

    import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.gsm.model.*;

@WebServlet("/gsmcontent.do")
public class GsmContentController extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        MemDAO dao = new MemDAO();
        MemVO vo = dao.MemContent(id);
        // 수정화면 JSP로 보내기 -> gsmcontent.jsp
        request.setAttribute("vo", vo);
        RequestDispatcher rd = request.getRequestDispatcher("gsmcontent.jsp");
        rd.forward(request, response);
    }
}