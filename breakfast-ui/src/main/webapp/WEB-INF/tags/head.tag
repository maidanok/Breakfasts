<%@tag language="java" pageEncoding="UTF-8" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div style="margin:20px 0;"></div>
    <div class="easyui-layout" style="width:100%; height:200px; ">
        <div data-options="region:'west'" style="width:30%; border:0;">12</div>
        <div data-options="region:'east'" style="width:40%; border:0;">
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
                    </c:if>
        </div>
        <div data-options="region:'center'" style="width:30%; border:0; align:top;">
            <h1>Message : ${message}</h1>
        </div>
    </div>