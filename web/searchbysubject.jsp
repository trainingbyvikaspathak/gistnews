<%-- 
    Document   : searchbysubject
    Created on : 25-Feb-2020, 07:35:03
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="base.jsp"></jsp:include>
        <script type="text/javascript"> 
            $(document).ready(function(){
               $("#subject").change(function(){
                   $("#courses").load("AjaxServlet?op=searchcourse&subjectid="+ $(this).val());
               }); 
            });
       </script>
       
       <style>
           ul {
               display: block;
           }
         
       </style>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col col-md-6">
                    <select  id ="subject" class="dropdown">
                        <option value="-1">Select Subject </option>
                        <%
                           
                            Connection con = null;
                            PreparedStatement smt = null;
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gisttraining", "root", "");
                                String sql = "select * from subject";
                                smt = con.prepareStatement(sql);
                                ResultSet rs = smt.executeQuery();

                                while (rs.next()) {%>
                        <option value="<%=rs.getString("id")%>"> <%=rs.getString("name")%> </option> 
                        <% }
                                con.close();
                                smt.close();

                            } catch (Exception e) {
                                System.out.println("Error " + e.getMessage());
                            }


                        %>
                        
                    </select>
                    
                    <br/>
                    
                    <div class="row" id="courses">
                        
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
