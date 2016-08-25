<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<table>
		<tr>
			<th>用户名</th>
			<th>密码</th>
		</tr>
		<tr>
			<td><s:property value="user.userName" /></td>
			<td><s:property value="password" /></td>
		</tr>
	</table>

</body>
</html>