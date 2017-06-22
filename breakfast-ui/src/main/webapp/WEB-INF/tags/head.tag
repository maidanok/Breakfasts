<%@tag language="java" pageEncoding="UTF-8" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

    <div id="navBar2">
        <ul>
            <li>12</li>
            <li><h1>Message : ${message}</h1></li>
            <li>

                <c:url value="/login" var="logoutUrl"/>
                <form action="${logoutUrl}" method="post" id="logoutForm">
                    <input type="hidden" name="${_csrf.parameterName}"
                           value="${_csrf.token}"/>
                </form>
    <script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
			}
    </script>
                <c:if test="${pageContext.request.userPrincipal.name != null}">
                        Welcome : ${pageContext.request.userPrincipal.name} | <a
                            href="javascript:
		formSubmit()"> Logout</a>
                </c:if></li>
        </ul>
    </div>