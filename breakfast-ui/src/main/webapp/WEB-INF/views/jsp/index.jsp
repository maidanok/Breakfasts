<<<<<<< HEAD
&lt;%@page session="false"%&gt;
<html>
<body>
<h1>"lreklfkdlemf"</h1>
<h1 style="color: red;">Title : ${title}</h1>
<h1 style="color: red;">Message : ${message}</h1>
<br>
<table style="text-align: left; width: 986px; height: 136px;"
 border="1" cellpadding="2" cellspacing="2">
  <tbody>
    <tr>
      <td>��������� ��������<br>
��������� ��� ����� ��������� � �������� ������</td>
    </tr>
    <tr>
      <td><a href="/admin">���������</a></td>
    </tr>
    <tr>
      <td>��������</td>
    </tr>
    <tr>
      <td>��������</td>
    </tr>
  </tbody>
</table>
</body>
</html>
=======
<<<<<<< HEAD
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
<title>Login Page</title>
<style>
.error {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #a94442;
	background-color: #f2dede;
	border-color: #ebccd1;
}

.msg {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #31708f;
	background-color: #d9edf7;
	border-color: #bce8f1;
}

#login-box {
	width: 300px;
	padding: 20px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 1px solid #000;
}
</style>
</head>
<body onload='document.loginForm.username.focus();'>

	<h1>Spring Security Login Form (Database Authentication)</h1>

	<div id="login-box">

		<h2>Login with Username and Password</h2>

		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>

		<form name='loginForm'
		  action="<c:url value='/j_spring_security_check' />" method='POST'>

		<table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='username'></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
				  value="submit" /></td>
			</tr>
		  </table>

		  <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />

		</form>
	</div>

=======
<%@page session="false"%>
<html>
<body>
	<h1>Title : ${title}</h1>
	<h1>Message : ${message}</h1>
>>>>>>> 2c17667e0b5b20b048fda1f89ff32b6a009afec2
</body>
</html>
>>>>>>> 9656cae0261cf4536414f983f613c58e52262f78
