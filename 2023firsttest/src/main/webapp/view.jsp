<%@ page import="firsttsest.news" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>
    
    <html>
    <%
    String newss[][]=new String[5][6];
    String denglumings=(String)session.getAttribute("dengluming");
    news me=new news();
    newss=me.liulannew(denglumings);
    %>
    
    
    
    
    
    
    
    
    
    
    
    
    </html>