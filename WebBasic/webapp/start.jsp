<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
 // 1 ~ 10 ������ ������ ���ϴ� �ڵ� �ۼ�
 int sum = 0;
 for(int i = 1; i <= 10; i++)
 {
	 sum += i;
 }
%>
 ���(3118_����) : <%=sum %>
</body>
</html>