package kr.gsm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calc.do")
public class CalcController extends HttpServlet {
   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          int su=Integer.parseInt(request.getParameter("su"));
          int sum=0;
          for(int i=0;i<=su;i++) {
             sum+=i;
          }
          // javascript·Î Àü¼Û
          PrintWriter out=response.getWriter();
          out.print(sum);
   }
}