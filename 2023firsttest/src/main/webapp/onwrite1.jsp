<%@ page import="firsttsest.news" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>
    
    <html>
    <% 
    String lanmus=request.getParameter("lanmu");
    String biaotis=request.getParameter("biaoti");
    String guanjianzis=request.getParameter("guanjianzi");
    String zhuangaorens=request.getParameter("zhuangaoren");
    String denglumings=(String)session.getAttribute("dengluming");
    String neirongs=request.getParameter("neirong");
    
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH");
    String riqis=formatter.format(date);
    
    news me=new news(); 
    int judge=me.xinzengnew(biaotis, guanjianzis, zhuangaorens, riqis, neirongs, denglumings, lanmus);
    
    if(judge==1)
    {
    %>
         <script >
         alert("提交成功！！！");
 	    window.history.back(-1);
         </script>  
    <%
    }
    else{
    	%>
    	<script >
         alert("提交失败！！！");
 	    window.history.back(-1);
         </script>  
    	<%
    }
    %>
    
    
    
    </html>