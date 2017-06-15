<!doctype html>
<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ attribute name="css" required="false" rtexprvalue="true" type="java.lang.String"%>
<%@ attribute name="javascript" required="false" rtexprvalue="true" type="java.lang.String"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<c:url var="cssPath" value="resources/jqwidgets-ver4.5.0"/>
    <link rel="stylesheet" href="${cssPath}/jqwidgets/styles/jqx.orange.css" media="screen">
    <link rel="stylesheet" href="${cssPath}/jqwidgets/styles/jqx.base.css" type="text/css">
    <script type="text/javascript" src="${cssPath}/scripts/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="${cssPath}/scripts/demos.js"></script>
    <script type="text/javascript" src="${cssPath}/jqwidgets/jqxcore.js"></script>
    <script type="text/javascript" src="${cssPath}/jqwidgets/jqxdata.js"></script>
    <script type="text/javascript" src="${cssPath}/jqwidgets/jqxdatatable.js"></script>
    <script type="text/javascript" src="${cssPath}/jqwidgets/jqxtabs.js"></script>
    <script type="text/javascript" src="${cssPath}/jqwidgets/jqxnavbar.js"></script>
    <script type="text/javascript" src="${cssPath}/jqwidgets/jqxlistbox.js"></script>
    <script type="text/javascript" src="${cssPath}/jqwidgets/jqxscrollbar.js"></script>
    <script type="text/javascript" src="${cssPath}/jqwidgets/jqxbuttons.js"></script>


<META http-equiv="Content-Type" content="text/html; charset=utf-8">

<script type="text/javascript">
        $(document).ready(function () {
        $("#navBar2").jqxNavBar({
                    height: 200, selectedItem: 0
                });
        $('#jqxTabs').jqxTabs({ width: '100%', height: 400, position: 'top', animationType: 'fade', selectionTracker: 'checked'});
            $('#settings div').css('margin-top', '10px');
        });
</script>
</head>
<body>
<jsp:doBody/>
</body>
</html>