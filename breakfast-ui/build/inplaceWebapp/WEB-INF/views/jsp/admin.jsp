<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib tagdir ="/WEB-INF/tags" prefix = "t"%>
<t:html>
<t:head/>
    <c:url var = "prefix" value = "/"/>;
    <div style="margin:20px 0 10px 0;"></div>
    <div class="easyui-tabs" style="width:100%;height:500px">
        <div title="Завтраки">
            <table id="breaktable" class="easyui-datagrid" style="width:95%;"
                   data-options="rownumbers:true,singleSelect:true,
                   url:'${prefix}admin/rest/breakfast/',method:'get',toolbar:toolbar">
                <thead>
                <tr>
                    <th data-options="field:'primaryKey',width:50">Item ID</th>
                    <th data-options="field:'nameBreakfast',width:200">Тип завтрака</th>
                    <th data-options="field:'price',width:80,align:'right'">Цена</th>
                </tr>
                </thead>
            </table>
        <script type="text/javascript">
            var toolbar = [{
                text:'Add',
                iconCls:'icon-add',
                handler:function(){
                    $('#wnewbr').form('load',{
                        nameBreakfast:'',
                        price:'0'
                    });
                    $('#wnewbr').window('open')
                }
            },{
                text:'Delete',
                iconCls:'icon-remove',
                handler:function(){
                    var row = $('#breaktable').datagrid('getSelected');
                    if (row){
                        $.ajax({
                            type:$('#delbreakf').attr('method'),
                            url: $('#delbreakf').attr('action')+row.primaryKey,
                            success: function(response){
                            $('#breaktable').datagrid('reload',response);
                        }
                        });
                    }
                }
            },'-',{
                text:'Edit',
                iconCls:'icon-edit',
                handler:function(){
                    var row = $('#breaktable').datagrid('getSelected');
                    if (row){
                        $('#weditbr').form('load',{
                            breakPK:row.primaryKey,
                            nameBreakf:row.nameBreakfast,
                            price1:row.price
                        });
                        $('#weditbr').window('open')
                    }
                }
            }];
    </script>
            <form id="delbreakf" action="${prefix}/admin/rest/breakfast/" method="DELETE"></form>
            <div id="wnewbr" class="easyui-window" title="Добавить завтрак" data-options="modal:true,closed:true,iconCls:'icon-save'" style="width:400px;height:250px;padding:10px;">
                <form id="newbreak" action="${prefix}admin/rest/newbreakfast/" method="post" enctype="multipart/form-data">
                    <div style="margin-bottom:20px">
                        <input id="nameBreakfast" value="" class="easyui-textbox" name="nameBreakfast"
                               style="width:100%" data-options="label:'Тип завтрака',required:true, labelPosition:'top'">
                    </div>
                    <div style="margin-bottom:20px">
                        <input id="price" value="" type="text" class="easyui-numberbox" name="price" label="Цена:" labelPosition="top"
                               precision="2" style="width:100%;">
                    </div>
                    <div style="text-align:center;padding:5px 0">
                        <input type="submit" value="ОК">
                    </div>
                </form>
            </div>
            <div id="weditbr" class="easyui-window" title="Редактировать завтрак" data-options="modal:true,closed:true,iconCls:'icon-save'" style="width:400px;height:250px;padding:10px;">
                <form id="editbr" action="${prefix}admin/rest/newbreakfast2/" method="POST" enctype="multipart/form-data">
                    <div style="margin-bottom:20px">
                        <input id="breakPK" name="breakPK" type="hidden" value="">
                        <input id="nameBreakf" value="" class="easyui-textbox" name="nameBreakf"
                               style="width:100%" data-options="label:'Тип завтрака',required:true, labelPosition:'top'">
                    </div>
                    <div style="margin-bottom:20px">
                        <input id="price1" value="" type="text" class="easyui-numberbox" name="price1" label="Цена:" labelPosition="top"
                               precision="2" style="width:100%;">
                    </div>
                    <div style="text-align:center;padding:5px 0">
                        <input type="submit" value="ОК">
                    </div>
                </form>
            </div>
        </div>
        <div title="Пользователи">

        </div>
        <div title="Номера"></div>
    </div>

    <script type="text/javascript">
        $('#newbreak').submit(function(){
                var msg = $('#newbreak').serialize();
            $.ajax({
              url: $('#newbreak').attr('action'),
              type: $('#newbreak').attr('method'),
              data : msg,
              success: function(response){
                $('#wnewbr').window('close')
                $('#breaktable').datagrid('reload',response);
              }
            });
            return false;
        });
    </script>

    <script type="text/javascript">
        $('#editbr').submit(function(){
               $.messager.alert('Info', "Редактировать завтрак")
            };
        return false;
        });
    </script>

</t:html>