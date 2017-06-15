<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib tagdir ="/WEB-INF/tags" prefix = "t"%>
<html>
<t:html>
    <script type="text/javascript">

    $(document).ready(function () {
    var url = "http://localhost:8080/breakfast-ui/admin/rest/breakfast/";
            var source =
            {
                dataType: "json",
                dataFields: [
                    { name: 'primaryKey', type: 'int' },
                    { name: 'nameBreakfast', type: 'string' },
                    { name: 'price', type: 'real' }
                ],
                id: 'id',
                url: url
            };
    var dataAdapter = new $.jqx.dataAdapter(source);

    $("#dataTable").jqxDataTable(
    {
    width: 850,
    pageable: true,
    pagerButtonsCount: 10,
    source: dataAdapter,
    columnsResize: true,
    columns: [
    { text: 'Name', dataField: 'nameBreakfast', width: 300 },
    { text: 'Price', dataField: 'price', width: 180 },
    ]
    });
    });
    </script>

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


    <div id='jqxWidget'>
        <div id='jqxTabs'>
            <ul>
                <li style="margin-left: 30px;">Завтраки</li>
                <li>Пользователи</li>
                <li>Номера</li>
            </ul>
            <div>
                <h1>Завтраки</h1>

                <div id="dataTable"></div>
            </div>
            <div>
                <h1>Прльзователи</h1>
            </div>
            <div>
                <h1>Номера</h1>
            </div>
        </div>
    </div>

    <div>
        <input type="button" value="Button" id='jqxButton'/>
    </div>

    <div id="console"></div>



    <script type="text/javascript">
        $('#jqxButton').click(function(){
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

</t:html>