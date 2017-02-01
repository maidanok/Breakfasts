<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 9656cae0261cf4536414f983f613c58e52262f78
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

<<<<<<< HEAD
	<h1>Spring Security Custom Login Form (XML)</h1>

	<div id="login-box">

		<h3>Login with Username and Password</h3>
=======
	<h1>Spring Security Login Form (Database Authentication)</h1>

	<div id="login-box">

		<h2>Login with Username and Password</h2>
>>>>>>> 9656cae0261cf4536414f983f613c58e52262f78

		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>
<<<<<<< HEAD
        <c:url var="loginUrl" value="/login" />
        <form action="${loginUrl}" method="post">


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
=======

		<form name='loginForm'
		  action="<c:url value='/j_spring_security_check' />" method='POST'>

		<table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='j_username'></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='j_password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
				  value="submit" /></td>
			</tr>
		  </table>

		  <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
>>>>>>> 9656cae0261cf4536414f983f613c58e52262f78

		</form>
	</div>

</body>
<<<<<<< HEAD
</html>
=======
</html>
=======
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@page session="true"%>
 <html>
 <body>
 	<h1>Title : ${title}</h1>
 	<h1>Message : ${message}</h1>

 	<c:if test="${pageContext.request.userPrincipal.name != null}">
 	   <h2>Welcome : ${pageContext.request.userPrincipal.name}
            | <a href="<c:url value="/j_spring_security_logout" />" > Logout</a></h2>
 	</c:if>
 </body>
 </html>
>>>>>>> 2c17667e0b5b20b048fda1f89ff32b6a009afec2
>>>>>>> 9656cae0261cf4536414f983f613c58e52262f78
