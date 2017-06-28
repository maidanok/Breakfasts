<!doctype html>
<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ attribute name="css" required="false" rtexprvalue="true" type="java.lang.String"%>
<%@ attribute name="javascript" required="false" rtexprvalue="true" type="java.lang.String"%>
<%@taglib tagdir ="/WEB-INF/tags" prefix = "t"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<c:url var="cssPath" value="resources/jquery-easyui-1.5.2"/>
    <link rel="stylesheet" href="${cssPath}/themes/default/easyui.css" media="screen">
    <link rel="stylesheet" href="${cssPath}/themes/icon.css" type="text/css">
    <script type="text/javascript" src="${cssPath}/jquery.min.js"></script>
    <script type="text/javascript" src="${cssPath}/jquery.easyui.min.js"></script>
    <c:url var="adminScript" value="resources/js"/>
    <script type="text/javascript" src="${adminScript}/main.js"></script>
<META http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<jsp:doBody/>
</body>
</html>