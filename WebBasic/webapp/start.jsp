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
 // 1 ~ 10 까지의 총합을 구하는 코드 작성
 int sum = 0;
 for(int i = 1; i <= 10; i++)
 {
	 sum += i;
 }
%>
 결과(3118_정훈) : <%=sum %>
</body>
</html>