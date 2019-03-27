<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
　　<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>
<script type="text/javascript">
	function requestJson() {
		//         $.post("${pageContext.request.contextPath}/music/login1.do",
		$.post(" <%=basePath%>/music/login1.do", 
				function(
				data) {
			console.log(data)
			alert("成功" + JSON.stringify(data))
		}, "json");

	}
</script>
</head>
<body>
	<form id="jsonh">
		<input type="button" value="开始" onclick="requestJson()" />
	</form>
</body>
</html>
