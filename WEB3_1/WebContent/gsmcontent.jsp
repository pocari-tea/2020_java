<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@page import="java.util.*" %>
<%@page import="kr.gsm.model.*" %> 
<%
    MemVO vo=(MemVO)request.getAttribute("vo");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
    function listGo(){
        location.href="gsmList.do";
    }
</script>
</head>
<body>
<h1>3118_���� (ȸ������ ���� ȭ��)</h1>
<form action="gsmupdate.do" method="post">
<input type="hidden" name="id" value="<%=vo.getId()%>">
<table border="1" width="300px;">
    <tr>
        <td>ID</td>
        <td><%=vo.getId()%></td>
    </tr>
    <tr>
        <td>PWD</td>
        <td><input type="text" name="pwd" value="<%=vo.getPwd()%>"></td>
    </tr>
    <tr>
        <td>AGE</td>
        <td><input type="text" name="age" value="<%=vo.getAge()%>"></td>
    </tr>
    <tr>
        <td colspan="2" align="center">
            <input type="submit" value="����">
            <input type="reset" value="���">
            <input type="button" value="����Ʈ" onclick="listGo()">
        </td>
    </tr>
</table>
</form>
</body>
</html>