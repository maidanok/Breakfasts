/**
 * Created by Pasha on 14.03.2017.
 */
myplus='<ul id="icons" class="ui-widget ui-helper-clearfix">' +
    '<li class="ui-state-default ui-corner-all" title=".ui-icon-plusthick" id="">' +
    '<span class="ui-icon ui-icon-plusthick"></span></li><ul>';

var
    room,
    breakfast,
    floor

$(document).ready(function(){
    $.ajax({
        type: "GET",
        dataType: "json",
        url: "http://localhost:8080/breakfast-ui/reception/rest/room/",
        success: function(data){
       room=data;
       }
    });

    $.ajax({
        type: "GET",
        dataType: "json",
        url: "http://localhost:8080/breakfast-ui/reception/rest/breakfast/",
        success:function (data) {
            breakfast=data;
        }
    });

    $.ajax({
        type:"GET",
        dataType:"json",
        url:"http://localhost:8080/breakfast-ui/reception/rest/floor/",
        success:function (data) {
            floor=data;
        }
    });

    $.ajax({
    type:"DELETE",
    url: prefix+"/admin/rest/breakfast/"+row.primaryKey,
        success: function(response){
        $('#breaktable').datagrid('reload',response);
        }
    });


                $.ajax({
                  url: $('#editbr').attr('action')+$(#breakPK).val(),
                  type: $('#editbr').attr('method'),
                  data : msg,
                  success: function(response){
                    $('#weditbr').window('close')
                    $('#breaktable').datagrid('reload',response);
                  }
});










