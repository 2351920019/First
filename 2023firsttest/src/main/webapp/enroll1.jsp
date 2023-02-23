<%@ page import="firsttsest.usemysql" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>
    
    <html>
    
      <%
      
    String jueses=request.getParameter("juese");
    String denglumings=request.getParameter("dengluming");
    String mimas=request.getParameter("mima");
    
      usemysql me=new usemysql();
      int judge=me.enroll(jueses, denglumings, mimas);
      
      
    if(judge==1){
    	%>
    	<script>
    	    alert("注册成功！！！);
    	    window.history.back(-1);
    	</script>
    	     <%
    }
    else {
    	%>
    	<script>
    	    alert("注册失败！！！);
    	    window.history.back(-1);
    	</script>
    	     <%
    }
    %>
    
</html>