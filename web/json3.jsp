<%-- 
    Document   : json3
    Created on : 15-Mar-2020, 08:13:14
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="base.jsp"></jsp:include>
        <script>
            $(document).ready(function () {
                $("#b1").click(function () {
                    $.get("http://localhost:8080/JavaTrining7am/restapi/v1/getobject", function (responseText) {
                        object = JSON.parse(responseText);
                        $("#p1").html("Name : " + object.name);
                    });
                });

                $("#b2").click(function () {
                    $.get("http://localhost:8080/JavaTrining7am/restapi/v1/getobject?rollno=" + $("#rollno").val(), function (responseText) {

                        $("#p1").html("");
                        student = JSON.parse(responseText);
                        if (student.hasOwnProperty("status"))
                            $("#p1").html("<b>Data Not Found</b>");
                        else {
                            $("#p1").append("Name :" + student.name);
                            $("#p1").append("<br/>ROllno :" + student.rollno);
                            $("#p1").append("<br/>Age :" + student.age);
                        }
                    });
                });

                   $("#b3").click(function(){
                      json = '{"rollno":"'+ $("#rollno1").val() +'","name" :"'+$("#name").val()+'","age":"'+$("#age").val() +'"}';
                      alert(json);
                      $.post("http://localhost:8080/JavaTrining7am/restapi/v1/getobject?json="+json,function(responseText){
                           alert(responseText);
                       });
 

            });
            
    });
        </script>
    </head>
    <body>
        <input type="button" id="b1" value="click to load single object"/>
        <input type="text" name="rollno" id="rollno"/> <input type="button" id="b2" value="click to search"/>
        <p id="p1">
        </p>
        
        <form> 
            <input type="text" id="rollno1" placeholder="rollno"/> <br/>
            <input type="text" name="name" id="name" placeholder="name"/><br/>
            <input type="text" name="age" id="age" placeholder="age"/><br/>
           
        </form>
            
        <br/>
        <input type="button" id="b3" value="Send Form's Data as Json"/> 
        
   
        
    </body>
</html>
