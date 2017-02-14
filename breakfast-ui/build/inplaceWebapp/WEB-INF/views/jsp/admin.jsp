<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="BreakfastCss.css">
</head>
<body>
	<h1>Title : ${title}</h1>
	<h1>Message : ${message}</h1>
    <h1>Hello, dear ${user.userName}! Your password hash: ${user.password} You Role is ${user.userRoles.role}. </h1>
	<c:url value="/login" var="logoutUrl" />
	<form action="${logoutUrl}" method="post" id="logoutForm">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
	<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		}
	</script>

	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<h2>
			Welcome : ${pageContext.request.userPrincipal.name} | <a
				href="javascript:formSubmit()"> Logout</a>
		</h2>
	</c:if>

</body>
</html>