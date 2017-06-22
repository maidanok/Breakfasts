<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib tagdir ="/WEB-INF/tags" prefix = "t"%>
<html>
<t:html>

    <script type="text/javascript">
        $(document).ready(function () {
        $("#navBar2").jqxNavBar({
            height: 200, selectedItem: 0
        });
        $('#jqxTabs').jqxTabs({
            width: '100%', height: 500, position: 'top',
            animationType: 'fade', selectionTracker: 'checked'
        });
        $('#settings div').css('margin-top', '10px');
        $("#price").jqxInput({height: 25, width: 250, minLength: 1});
        $("#nameBreakfast").jqxInput({height: 25, width: 250, minLength: 1});
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
            { text: 'Price', dataField: 'price', width: 180 }
            ]
        });
    });

    var basicDemo = (function () {
            //Adding event listeners
        function _addEventListeners() {
            $('#showWindowButton').click(function () {
                $('#window').jqxWindow('open');
            });
        };
            //Creating all page elements which are jqxWidgets
        function _createElements() {
            $('#showWindowButton').jqxButton({ width: '70px' });
        };
            //Creating the demo window
            function _createWindow() {
                var jqxWidget = $('#jqxWidget');
                var offset = jqxWidget.offset();
                $('#window').jqxWindow({
                    draggable: true,
                    resizable: false,
                    autoOpen: false,
                    position: { x: offset.left + 50, y: offset.top + 50} ,
                    showCollapseButton: true, maxHeight: 400, maxWidth: 350, minHeight: 200, minWidth: 200, height: 300, width: 500,
                    initContent: function () {
                        $('#window').jqxWindow('focus');
                    }
                });
            };
            return {
                config: {
                    dragArea: null
                },
                init: function () {
                    //Creating all jqxWindgets except the window
                    _createElements();
                    //Attaching event listeners
                    _addEventListeners();
                    //Adding jqxWindow
                    _createWindow();
                }
            };
        } ());
        $(document).ready(function () {
            //Initializing the demo
            basicDemo.init();
        });
    </script>
<t:head/>
        <div id='jqxTabs'>
            <ul>
                <li style="margin-left: 30px;">Завтраки</li>
                <li>Пользователи</li>
                <li>Номера</li>
            </ul>

            <div>
                <h3>Завтраки</h3>

                <div style="float: left;">
                    <div>
                        <input type="button" value="Добавить" id="showWindowButton" />
                    </div>
                </div>
                <br><br>
                <div id="dataTable"></div>
                    <br>
                <div id="jqxWidget">
                    <div style="width: 100%; height: 650px; margin-top: 50px;" id="mainDemoContainer">
                        <div id="window">
                            <div id="windowHeader">
                                <span>
                                    New Breakfast
                                </span>
                            </div>
                            <div style="overflow: hidden;" id="windowContent">
                                <form id="newBreakfast" method="post" action="http://localhost:8080/breakfast-ui/admin/rest/newbreakfast/">
                                    <div style='margin-top: 10px;'>Name</div>
                                    <input type="text" name = "nameBreakfast" id="nameBreakfast" value=""/>
                                    <div style='margin-top: 10px;'>Price</div>
                                    <input type="text" name = "price" id="price" value=""/>
                                    <div></div>
                                    <input id="breakfastsubmit" type="button" value="Save" onclick='submitForm("newBreakfast")'/>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>



            <div>
                <h1>Прльзователи</h1>
            </div>

            <div>
                <h1>Номера</h1>
            </div>
        </div>
</t:html>