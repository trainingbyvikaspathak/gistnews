 
package com.rest;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import java.sql.Array;
import java.util.ArrayList;

class Student{
    private int rollno,age;
    private String name;
    public Student(){}

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
  
    
}

class Error{
    private String status,message;
    
    public Error(){}

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}

public class JsonServlet1 extends HttpServlet {
    
   

     
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out= response.getWriter();
        response.setContentType("text/html");
        Student s = new Student();
        s.setName("Mohan lal");
        s.setAge(20);
        s.setRollno(101);
        Student s1 = new Student();
        s1.setName("Mamata");
        s1.setRollno(102);
        s1.setAge(19);
        
        Student s3 = new Student();
        s3.setAge(23);
        s3.setName("suresh");
        s3.setRollno(103);
        
        ArrayList<Student> list = new ArrayList();
        list.add(s);
        list.add(s1);
        list.add(s3);
        
        String rollno = request.getParameter("rollno");
        if(rollno==null)
        {
        
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(s);
        out.println(json);
    }
        
        else {
             Student std = null;
            for(Student ss : list){
                if(ss.getRollno() == Integer.parseInt(rollno))
                {
                    std = ss;
                    ObjectMapper mapper = new ObjectMapper();
                    String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(std);
                    out.println(json);  
                }
            }
            if(std==null)
            {
                Error error = new Error();
                error.setStatus("200");
                error.setMessage("Data Not Found");
                ObjectMapper mapper = new ObjectMapper();
                String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(error);
               out.println(json);  
            }
                
            
        }
    
    }
    
    

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String json = request.getParameter("json");
      System.out.println(json);
      
      //convering json string into java object
      ObjectMapper mapper = new ObjectMapper();
      Student student = new Student();
      student =  mapper.readValue(json, Student.class);
      System.out.println(student.getRollno() +"\n"+ student.getName()  +"\n" + student.getAge());
  }
   
}
