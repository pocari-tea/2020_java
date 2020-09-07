package kr.gsm.controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kr.gsm.model.LBSMAP;

@WebServlet("/teammap.do")
public class TeamController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
	 throws ServletException, IOException {
		LBSMAP dao=new LBSMAP();
		String json=dao.memAllList();
		response.setContentType("text/json;charset=euc-kr");
		PrintWriter out=response.getWriter();
		out.println(json);
	}
}