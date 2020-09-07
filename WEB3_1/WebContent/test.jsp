<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%!
    public int hap(){
        int sum = 0;
        for(int i = 0;i <= 10; i++){
            sum+=i;
        }
        return sum;
    }
%>
<%-- jsp 실습 --%>
<!-- jsp 실습 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%!
    int v = hap();
%>
<table border = "1">
    <tr>
        <td>결과 3118 정훈</td>
        <td><%=v %></td>
    </tr>
</table>
</body>
</html>