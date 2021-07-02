<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TODOアプリ出力画面</title>
</head>
<body>
<h1>TODOアプリケーション</h1>
<h2>渡邊新のTODOリスト</h2>
<table border="1">
	<tr>
		<th>No</th>
		<th>重要度</th>
		<th>内容</th>
		<th>期日</th>
	</tr>
	<%
	String today = new SimpleDateFormat("MM月dd日").format(new Date());
	for (int i = 1; i <= 10; i++) {
	%>
	<tr>
		<td><%=i%></td>
		<%
		int randomValue = new Random().nextInt(4);
		String randomString = new String[] { "Linuxテスト対策", "paiza", "TODOアプリ作成", "履歴書作成" }[randomValue];
		%>
		<td><%=randomValue + 1%></td>
		<td><%=randomString%></td>
		<td><%=today%></td>
	</tr>
	<%
	}
	%>
</table>
</body>
</html>