<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@page import="java.util.*" %>
<%@page import="kr.gsm.model.*" %>    
<%
    List<MemVO> list=(List<MemVO>)request.getAttribute("list");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>3118_정훈_회원목록 출력(View)</h1>
 <table border="1" width="500px">
   <tr>
      <td>ID</td>
      <td>PWD</td>
      <td>AGE</td>
      <td>삭제</td>
   </tr>
   <% for(MemVO vo : list){  %>
    <tr>
      <td><a href="gsmcontent.do?id=<%=vo.getId()%>"><%=vo.getId()%></a></td>
      <td><%=vo.getPwd()%></td>
      <td><%=vo.getAge()%></td>
      <td><a href="./GsmDelete.do?id=<%=vo.getId()%>">삭제</a></td>
    </tr>
   <% } %>
   <tr>
       <td colspan="4" align="right"><a href="member.html">회원가입</a></td>
   </tr>
 </table>
</body>
</html>