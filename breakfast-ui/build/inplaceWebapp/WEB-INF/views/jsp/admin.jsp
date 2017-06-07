<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="<c:url value="/resources/jquery-ui-1.12.1.custom/jquery-ui.theme.css" />">
    <script type="text/javascript" src="<c:url value="/resources/jquery-ui-1.12.1.custom/external/jquery/jquery.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/jquery-ui-1.12.1.custom/jquery-ui.min.js"/>"></script>
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
	<h1>Title : ${title}</h1>
	<h1>Message : ${message}</h1>
    <h1>Hello, dear &#1086;&#1088;&#1083;&#1088; ${user.userName}! Your password hash: ${user.password} You Role is ${user.userRoles.role}. </h1>

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
				href="javascript:
		formSubmit()"> Logout</a>
		</h2>
	</c:if>



<button id="ajax" class="ui-button ui-corner-all ui-widget">ajax call</button>

<script type="text/javascript">

    $('#ajax').click(function(){
         $.ajax({
             type: "GET",
             dataType: "json",
             url: "http://localhost:8080/breakfast-ui/admin/rest/breakfast/",
             success: function(data){
             i=0;
             while (i<data.length){
                say(data[i].nameBreakfast+" "+data[i].price);
                i ++;
                };
             },
             error: function(val, error){
             alert (error);
             }
         });
    });
    function say(text){
$('#console').append('<div>'+text+'</div>')
 };

</script>

    <ul id="icons" class="ui-widget ui-helper-clearfix">
    <li class="ui-state-default ui-corner-all" title=".ui-icon-circle-plus"><span class="ui-icon ui-icon-circle-plus"></span></li>
<div id="console"></div>
</body>
</html>