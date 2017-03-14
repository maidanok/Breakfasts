<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
	<meta charset="utf-8">
	<link rel="stylesheet" href="<c:url value="/resources/jquery-ui-1.12.1.custom/jquery-ui.theme.css" />">
	<script type="text/javascript" src="<c:url value="/resources/jquery-ui-1.12.1.custom/external/jquery/jquery.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/jquery-ui-1.12.1.custom/jquery-ui.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/reception.js"/>"></script>
	<style>
	body{
	font-family: "Trebuchet MS", sans-serif;
	margin: 50px;
	}
	.demoHeaders {
	margin-top: 2em;
	}
	#dialog-link {
	padding: .4em 1em .4em 20px;
	text-decoration: none;
	position: relative;
	}
	#dialog-link span.ui-icon {
	margin: 0 5px 0 0;
	position: absolute;
	left: .2em;
	top: 50%;
	margin-top: -8px;
	}
	#icons {
	margin: 0;
	padding: 0;
	}
	#icons li {
	margin: 2px;
	position: relative;
	padding: 4px 0;
	cursor: pointer;
	float: left;
	list-style: none;
	}
	#icons span.ui-icon {
	float: left;
	margin: 0 4px;
	}
	.fakewindowcontain .ui-widget-overlay {
	position: absolute;
	}
	select {
	width: 200px;
	}
	</style>

	</head>
<body>
<h1>&#1053;&#1072;&#1079;&#1074;&#1072;&#1085;&#1080;&#1077; &#1089;&#1090;&#1088;&#1072;&#1085;&#1080;&#1094;&#1099;</h1>
<h1>Title : ${title}</h1>
<h1>Message : ${message}</h1>
	<table>
	<tr>
	<td width="600" valign="top">
		<button id="dialog-link" class="ui-button ui-corner-all ui-widget">
		<span class="ui-icon ui-icon-newwin"></span>Open Dialog
		</button>
	</td>
		<td>
		<table id="myrooms">
		</table>
		</td>
	</tr>


	</table>



</body>
</html>