/**
 * Created by Pasha on 14.03.2017.
 */
myplus='<ul id="icons" class="ui-widget ui-helper-clearfix"><li class="ui-state-default ui-corner-all" title=".ui-icon-plusthick"><span class="ui-icon ui-icon-plusthick"></span></li><ul>';
$(function(){$.ajax({
    type: "GET",
    dataType: "json",
    url: "http://localhost:8080/breakfast-ui/reception/rest/room/",
    success: function(data){
        i=0;
        while (i<data.length){
            say(data[i].room);
            i ++;
        };
    },
    error: function(val, error){
        alert (error+" "+ val);
    }
});

    function say(text){
        $('#myrooms').append('<tr><td>'+myplus+text+'</td><tr>')
    };
});

