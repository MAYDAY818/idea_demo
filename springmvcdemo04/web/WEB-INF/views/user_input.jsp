<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<body>
<fieldset>
	<legend>用户信息</legend>
	<form action="/save1" method="post">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input name="username"></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input name="password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="注册">
				</td>
			</tr>
		</table>
	</form>
</fieldset>
<br/>
<fieldset>
	<legend>用户信息2</legend>
	<form action="/save2" method="post">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input name="username"></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input name="password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="注册">
				</td>
			</tr>
		</table>
	</form>
</fieldset>
<br/>
<fieldset>
	<legend>用户信息3--对象属性封装</legend>
	<form action="/save3" method="post">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input name="username"></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input name="password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="注册">
				</td>
			</tr>
		</table>
	</form>
</fieldset>
<br/>
<fieldset>
	<legend>用户信息4--表单名称</legend>
	<form action="/save4" method="post">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input name="name"></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input name="password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="注册">
				</td>
			</tr>
		</table>
	</form>
</fieldset>
</body>
</body>
</html>