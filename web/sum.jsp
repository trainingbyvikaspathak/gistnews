<%-- 
    Document   : sum
    Created on : 27-Feb-2020, 07:26:06
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int a,b,c;
            a = request.getParameter("n1")!=null ? Integer.parseInt(request.getParameter("n1")): 0;
            b = request.getParameter("n2")!=null ? Integer.parseInt(request.getParameter("n2")): 0;
            c=a+b;
            %>
        
        <form method="post">
            Enter first no  :<input type="text" name="n1" value="<%=a%>"/><br/>
            Enter second no :<input type="text" name="n2" value="<%=b%>"/><br/>
            
            <input type="submit" name="submit" value="Add"/>
        </form>

        <%if(request.getParameter("submit")!=null){%>
        <b>First no = <%=a%> <br/>
            Second no = <%=b%></b>
            <br/>
            <h2>sum = <%=c%></h2>
            
            <%}%>
    </body>
</html>
