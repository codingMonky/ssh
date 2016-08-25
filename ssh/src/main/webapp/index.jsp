<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
<head>用户登录
</head>
<body>
	<s:form action="hello.html">
		<s:textfield name="user.userName" label="用户名"></s:textfield>
		<s:password name="password" label="密码"></s:password>
		<s:submit></s:submit>
	</s:form>
</body>
</html>