<%@ page import="firsttsest.usemysql" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>
    
    <html>
    
      <%
      
    String jueses=request.getParameter("juese");
    String denglumings=request.getParameter("dengluming");
    String mimas=request.getParameter("mima");
    
    
    usemysql me=new usemysql();
    int judge=me.index(jueses, denglumings, mimas);
    
    %>
    
    
    
    
    <%
 if(judge!=1)  {
    	
    	%>
    	<script>

    	    alert("角色不符或（账号或密码错误）！！！");
    	    window.history.back(-1);
    	</script>
    	     <%
    }
 else {session.setAttribute("dengluming", denglumings);}
    
   out.print("欢迎"+(String)session.getAttribute("dengluming")+"的登录！！！"); 
    
   
    
    if(judge==1&&jueses.equals("user"))
    {
  %>
      	 <div  align="center">
<a href="viewnews.jsp">
<button align="center">浏览新闻</button>
</a>
  
        	 <div  align="center">
<a href="viewusers.jsp">
<button align="center">浏览用户</button>
</a>


  
  <%   	
    }
   
    
    
    
    
    
    
    
    
    
    
    
    if(judge==1&&jueses.equals("vipuser"))
    {
  %>
      	 <div  align="center">
<a href="onwrite.jsp">
<button align="center">在线撰写与修改稿件</button>
</a>
  
        	 <div  align="center">
<a href="view.jsp">
<button align="center">查看已写稿件</button>
</a>
  
  <%   	
    }
   
  
    
    
    
    
    
    if(judge==1&&jueses.equals("vvipuser"))
    {
  %>
      	 <div  align="center">
<a href="sendnews.jsp">
<button align="center">浏览与管理本栏目待发与已发新闻</button>
</a>

  <%   	
    }

   
    
    
    
    
    
    
    
    if(judge==1&&jueses.equals("admin"))
    {
  %>
      	 <div  align="center">
<a href="enroll.jsp">
<button align="center">用户注册</button>
</a>

      	 <div  align="center">
<a href="enroll.jsp">
<button align="center">用户权限管理</button>
</a>

      	 <div  align="center">
<a href="newsmanage.jsp">
<button align="center">新闻栏目管理</button>
</a>

  <%   	
    }
 
    
    %>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    </html>